package KBA_Advance_Review2;

import java.util.ArrayList;
import java.util.List;

public class Program1_AccountAbstract
{
    // 1) Abstract base representing a generic account
    static abstract class Account {
        protected int accountId;          // (1) visible to subclasses
        protected double balance;         // (2) current balance

        public Account(int accountId, double initial) { // (3)
            this.accountId = accountId;
            this.balance = initial;
        }

        public void deposit(double amount) {            // (4) common behavior
            if (amount <= 0) throw new IllegalArgumentException("Deposit must be > 0");
            balance += amount;
            System.out.printf("Account %d: deposited %.2f, new balance %.2f%n", accountId, amount, balance); // (5)
        }

        public void withdraw(double amount) {           // (6) common behavior
            if (amount <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
            if (amount > balance) throw new IllegalStateException("Insufficient funds");
            balance -= amount;
            System.out.printf("Account %d: withdrew %.2f, new balance %.2f%n", accountId, amount, balance); // (7)
        }

        // 8) Abstract method forces subclasses to provide interest logic
        public abstract double calculateInterest();
    }

    // 2) SavingsAccount applies a percentage interest
    static class SavingsAccount extends Account {
        private double annualRate; // e.g., 0.02 for 2%

        public SavingsAccount(int id, double initial, double annualRate) { // (9)
            super(id, initial);
            this.annualRate = annualRate;
        }

        @Override
        public double calculateInterest() { // (10)
            double interest = balance * annualRate;
            System.out.printf("SavingsAccount %d: interest %.2f%n", accountId, interest);
            return interest;
        }
    }

    // 3) CheckingAccount might have no interest or minimal interest
    static class CheckingAccount extends Account {
        public CheckingAccount(int id, double initial) { // (11)
            super(id, initial);
        }

        @Override
        public double calculateInterest() { // (12)
            double interest = 0.0; // checking gets no interest in this model
            System.out.printf("CheckingAccount %d: interest %.2f%n", accountId, interest);
            return interest;
        }
    }

    // 4) Demo main: operate on accounts and apply interest
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>(); // (13)
        accounts.add(new SavingsAccount(1001, 1000.00, 0.02)); // (14)
        accounts.add(new CheckingAccount(2001, 500.00));       // (15)

        accounts.get(0).deposit(200);   // (16)
        accounts.get(1).withdraw(50);   // (17)

        // 5) Polymorphically calculate interest for all
        for (Account a : accounts) {    // (18)
            double i = a.calculateInterest(); // (19)
            // optionally add interest to balance:
            a.deposit(i);               // (20) reuse deposit method to add interest
        }
    }

}
