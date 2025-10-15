package Banking2;

public class Task2_TransactionArray
{
    // (1) reuse Account class (paste before this class when compiling)

    // (2) helper to print transaction history
    static void printHistory(Account[] accounts, double[][] tx, int[] txCount) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getCustomerName() + " (Balance: " +
                    String.format("%.2f", accounts[i].getBalance()) + ")");
            System.out.print("  Transactions: ");
            if (txCount[i] == 0) {
                System.out.println("none");
            } else {
                for (int j = 0; j < txCount[i]; j++) {
                    System.out.print(String.format("%.2f", tx[i][j]));
                    if (j < txCount[i] - 1) System.out.print(", ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // (3) configuration
        final int N = 3;  // number of accounts
        final int M = 5;  // max transactions per account

        // (4) create accounts
        Account[] accounts = new Account[] {
                new Account("Eve", 500.00),
                new Account("Sam", 1000.00),
                new Account("Lina", 1500.00)
        };

        // (5) transaction storage arrays
        double[][] transactions = new double[N][M]; // (5.1) default 0.0
        int[] txCount = new int[N]; // (5.2) counts start at 0

        // (6) addTransaction function implemented inline for simplicity
        // addTransaction(accountIndex, amount)
        java.util.function.BiConsumer<Integer, Double> addTransaction = (index, amount) -> {
            if (index < 0 || index >= N) {
                System.out.println("Invalid account index");
                return;
            }
            if (txCount[index] >= M) {
                System.out.println("Transaction history full for " + accounts[index].getCustomerName());
                return;
            }
            // store transaction
            transactions[index][txCount[index]] = amount; // (6.1)
            txCount[index]++; // (6.2)
            // update balance (positive=deposit, negative=withdraw)
            if (amount >= 0) accounts[index].deposit(amount);
            else accounts[index].withdraw(-amount);
        };

        // (7) sample transactions
        addTransaction.accept(0, 200.00);   // Eve deposit
        addTransaction.accept(1, -50.00);   // Sam withdraw
        addTransaction.accept(2, 300.00);   // Lina deposit
        addTransaction.accept(2, -100.00);  // Lina withdraw

        // (8) print final state & history
        printHistory(accounts, transactions, txCount);
    }
}







