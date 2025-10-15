package Banking;

public class Account {
    private double balance;
    private String customerName;

    public void setCustomerName(String name) { this.customerName = name; }
    public String getCustomerName() { return this.customerName; }

    public void deposit(double amount) { this.balance += amount; }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance for " + this.customerName);
        }
    }

    public double getBalance() { return this.balance; }

    // (6) Transfer money to another account
    public void transferTo(Account other, double amount) {
        if (amount <= this.balance) {
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Transfer failed: Insufficient balance in " + this.customerName + "'s account");
        }
    }


}





