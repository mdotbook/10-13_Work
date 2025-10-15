package Banking;

public class AccountImpl
{
    public static void main(String[] args) {
        Account bob = new Account();
        bob.setCustomerName("Bob");
        bob.deposit(500);

        Account alice = new Account();
        alice.setCustomerName("Alice");

        // (7) Transfer $200 from Bob to Alice
        bob.transferTo(alice, 200);

        // (8) Print balances
        System.out.println("Bob's balance: $" + bob.getBalance());
        System.out.println("Alice's balance: $" + alice.getBalance());
    }

}



