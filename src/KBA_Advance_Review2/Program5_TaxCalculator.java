package KBA_Advance_Review2;

import java.util.*;

public class Program5_TaxCalculator {
    static abstract class TaxCalculator {
        protected String country;

        public TaxCalculator(String country) { this.country = country; } // (1)

        public final double compute(double income) { // (2) final wrapper
            double tax = calculateTax(income);     // (3)
            return round2(tax);                    // (4)
        }

        protected abstract double calculateTax(double income); // (5)

        protected double round2(double v) { // (6)
            return Math.round(v * 100.0) / 100.0;
        }
    }

    static class USATaxCalculator extends TaxCalculator {
        private double rate; // simple flat rate model for demo

        public USATaxCalculator(double rate) { super("USA"); this.rate = rate; } // (7)

        @Override
        protected double calculateTax(double income) { // (8)
            return income * rate;
        }
    }

    static class UKTaxCalculator extends TaxCalculator {
        public UKTaxCalculator() { super("UK"); } // (9)

        @Override
        protected double calculateTax(double income) { // (10)
            // simple bracket example: 0% up to 12k, 20% next up to 50k, 40% above
            double tax = 0;
            if (income > 12000) {
                double taxable20 = Math.min(income, 50000) - 12000;
                tax += taxable20 * 0.20;
            }
            if (income > 50000) {
                tax += (income - 50000) * 0.40;
            }
            return tax;
        }
    }

    public static void main(String[] args) {
        List<TaxCalculator> calculators = Arrays.asList(new USATaxCalculator(0.22), new UKTaxCalculator()); // (11)
        double income = 60000;
        for (TaxCalculator tc : calculators) { // (12)
            System.out.printf("%s tax on %.2f -> %.2f%n", tc.country, income, tc.compute(income)); // (13)
        }
    }
}

