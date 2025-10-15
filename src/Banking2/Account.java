package Banking2;

public class Account
{
    private double balance;        // (1) account balance
    private String customerName;   // (2) account owner

    // (3) constructors
    public Account() { this.balance = 0.0; this.customerName = ""; }
    public Account(String name, double balance) {
        this.customerName = name;
        this.balance = balance;
    }

    // (4) getters & setters
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    // (5) basic operations
    public void deposit(double amount) { if (amount > 0) balance += amount; }
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) { balance -= amount; return true; }
        return false;
    }

    @Override
    public String toString() {
        return customerName + " : " + String.format("%.2f", balance);
    }

}
