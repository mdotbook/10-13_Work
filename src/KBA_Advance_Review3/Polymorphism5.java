package KBA_Advance_Review3;

abstract class Transaction {
    protected double amount;
    public Transaction (double amount) {this.amount = amount;}
    public abstract void process();
}
class Payment extends Transaction {
    public Payment(double amount) { super(amount); }
    @Override
    public void process() {
        System.out.println("Processing payment of $" + amount);
    }
}

class Refund extends Transaction {
    public Refund(double amount) { super(amount); }
    @Override
    public void process() {
        System.out.println("Processing refund of $" + amount);
    }
}

public class Polymorphism5 {
    public static void main(String[] args) {
        Transaction[] transactions = { new Payment(100), new Refund(50) };
        for(Transaction tx : transactions) {
            tx.process(); // polymorphic call
        }
    }
}

