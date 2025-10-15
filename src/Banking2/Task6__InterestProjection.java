package Banking2;

import java.util.ArrayList;

public class Task6__InterestProjection
{
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Mason", 1000.00));
        accounts.add(new Account("Olivia", 2500.00));
        accounts.add(new Account("Ravi", 350.25));

        double annualRate = 3.6; // 3.6% per year
        int months = 12;

        System.out.println("Projected balances after " + months + " months at " + annualRate + "%:");

        for (Account acc : accounts) {
            double factor = Math.pow(1.0 + annualRate / 1200.0, months);
            double projected = acc.getBalance() * factor;
            System.out.println(acc.getCustomerName() + " -> " + String.format("%.2f", projected));
        }
    }

}
