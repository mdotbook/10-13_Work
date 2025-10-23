package KBA_Advance_Review3;

abstract class TaxCalculator {
    public abstract double calculateTax(double income);
}

class USTaxCalculator extends TaxCalculator {
    @Override
    public double calculateTax(double income) { return income * 0.20; }
}

class UKTaxCalculator extends TaxCalculator {
    @Override
    public double calculateTax(double income) {
        double tax = 0;
        if(income > 12000) tax += Math.min(income,50000)-12000*0.2;
        if(income > 50000) tax += (income-50000)*0.4;
        return tax;
    }
}

public class Polymorphism7 {
    public static void main(String[] args) {
        TaxCalculator[] calculators = { new USTaxCalculator(), new UKTaxCalculator() };
        double income = 60000;
        for(TaxCalculator tc : calculators) {
            System.out.println(tc.getClass().getSimpleName() + " tax: " + tc.calculateTax(income));
        }
    }
}

