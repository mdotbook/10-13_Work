package Banking2;

import java.util.Arrays;
import java.util.Comparator;


public class Task3_TopKByBalance
{
    // (1) reuse Account class (paste before this class when compiling)

    public static Account[] topK(Account[] accounts, int K) {
        // (2) clone to avoid mutating original array if needed
        Account[] copy = Arrays.copyOf(accounts, accounts.length); // (2.1)
        // (3) sort descending
        Arrays.sort(copy, Comparator.comparingDouble(Account::getBalance).reversed()); // (3.1)
        // (4) bound K
        int resultSize = Math.min(K, copy.length); // (4.1)
        Account[] result = new Account[resultSize];
        System.arraycopy(copy, 0, result, 0, resultSize); // (4.2)
        return result;
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[] {
                new Account("Ana", 2200.00),
                new Account("Bob", 4500.50),
                new Account("Cara", 300.00),
                new Account("Dan", 990.00)
        };

        // (5) get top 2
        Account[] top2 = topK(accounts, 2);
        System.out.println("Top 2 accounts by balance:");
        for (Account a : top2) {
            System.out.println(" - " + a);
        }
    }

}
