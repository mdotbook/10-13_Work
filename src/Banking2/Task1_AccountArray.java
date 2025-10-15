package Banking2;

import java.util.Arrays;
import java.util.Comparator;

public class Task1_AccountArray
{
    public static void main(String[] args) {
        // Create an array of Account objects
        Account[] accounts = new Account[] {
                new Account("Zoe", 2500.00),
                new Account("Adam", 1200.50),
                new Account("Maya", 980.75),
                new Account("Bella", 3050.00),
        };

        // (3) compute total and average
        double total = 0.0;
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance();
        }
        double average = total / accounts.length;

        // (4) sort by customer name
        Arrays.sort(accounts, Comparator.comparing(Account :: getCustomerName));

        // Output results
        System.out.println("Total balance across accounts: " + String.format(" %.2f", total));
        System.out.println("Average balance: " + String.format(" %.2f", average));
        System.out.println("Accounts (sorted by name):");
        for (Account a : accounts) {
            System.out.println(" - " + a);
        }

    }

}
