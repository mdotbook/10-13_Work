package KBA_Advance_Review2;

import java.util.*;

public class Program4_TransactionProcessor {
    static abstract class TransactionProcessor {
        protected String txId;
        protected double amount;
        public TransactionProcessor(String txId, double amount) {
            this.txId = txId; this.amount = amount;
        }

        // final template method that runs the lifecycle
        public final void execute() {
            validate();        // (1)
            apply();           // (2)
            record();          // (3)
        }

        protected abstract void validate(); // (4)
        protected abstract void apply();    // (5)

        // common recording logic
        protected void record() {           // (6)
            System.out.printf("Transaction %s recorded: amount %.2f%n", txId, amount);
        }
    }

    static class PaymentProcessor extends TransactionProcessor {
        public PaymentProcessor(String txId, double amount) { super(txId, amount); } // (7)

        @Override
        protected void validate() {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount for payment");
            System.out.println("Payment validated");
        }

        @Override
        protected void apply() {
            System.out.printf("Applying payment of %.2f (decrease AR / increase cash)%n", amount);
        }
    }

    static class RefundProcessor extends TransactionProcessor {
        public RefundProcessor(String txId, double amount) { super(txId, amount); } // (8)

        @Override
        protected void validate() {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount for refund");
            System.out.println("Refund validated");
        }

        @Override
        protected void apply() {
            System.out.printf("Applying refund of %.2f (decrease cash / increase AR)%n", amount);
        }
    }

    public static void main(String[] args) {
        TransactionProcessor pay = new PaymentProcessor("TX100", 150.0); // (9)
        TransactionProcessor ref = new RefundProcessor("TX101", 25.0);  // (10)
        pay.execute(); // (11)
        ref.execute(); // (12)
    }
}

