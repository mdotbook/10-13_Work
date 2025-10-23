package KBA_Advance_Review4;

class TaxCalculator {
    // (1) single income
    double calculateTax(double income) {
        return income * 0.20;
    }

    // (2) multiple incomes
    double calculateTax(double[] incomes) {
        double total = 0;
        for(double income : incomes) total += income;
        return total * 0.20;
    }

    // (3) income with deduction
    double calculateTax(double income, double deduction) {
        return (income - deduction) * 0.20;
    }
}

public class MethodOverloading3 {
    public static void main(String[] args) {
        TaxCalculator tax = new TaxCalculator();

        System.out.println("Single income tax: " + tax.calculateTax(5000));
        double[] incomes = {3000, 2000, 1000};
        System.out.println("Multiple incomes tax: " + tax.calculateTax(incomes));
        System.out.println("Income with deduction tax: " + tax.calculateTax(5000, 1000));
    }
}

