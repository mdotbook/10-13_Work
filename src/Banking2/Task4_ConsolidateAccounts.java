package Banking2;

import java.util.Arrays;

public class Task4_ConsolidateAccounts
{
    // (1) reuse Account class (paste before this class when compiling)

    public static Account[] consolidate(Account[] input) {
        Account[] temp = new Account[input.length];
        int uniqueCount = 0;

        for (int i = 0; i < input.length; i++) {
            String name = input[i].getCustomerName();
            double bal = input[i].getBalance();

            // (2) search for name in temp[0..uniqueCount-1]
            int found = -1;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j].getCustomerName().equals(name)) {
                    found = j;
                    break;
                }
            }

            if (found != -1) {
                // (3) merge balances
                temp[found].setBalance(temp[found].getBalance() + bal);
            } else {
                // (4) add new unique account
                temp[uniqueCount++] = new Account(name, bal);
            }
        }

        // (5) trim to uniqueCount
        return Arrays.copyOf(temp, uniqueCount);
    }

    public static void main(String[] args) {
        Account[] input = new Account[] {
                new Account("Alex", 100.0),
                new Account("Ben", 200.0),
                new Account("Alex", 300.0),
                new Account("Cleo", 50.0),
                new Account("Ben", 100.0)
        };

        Account[] consolidated = consolidate(input);
        System.out.println("Consolidated accounts:");
        for (Account a : consolidated) System.out.println(" - " + a);
    }

}
