package KBA_Advance_Review3;

abstract class BankAccount {
    protected double balance;
    public BankAccount(double balance) {this.balance = balance;}
    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {super(balance);}
    @Override
    public double calculateInterest() {return balance * 0.02;}
}
class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) { super(balance); }
    @Override
    public double calculateInterest() { return balance * 0.005; } // (3)
}

public class Polymorphism4 {
    public static void main(String[] args) {
        BankAccount[] accounts = {new SavingsAccount(1000), new CheckingAccount(2000)};
        for (BankAccount acc : accounts) {
            System.out.println(acc.getClass().getSimpleName() + " interest: " + acc.calculateInterest());
        }
    }
}
