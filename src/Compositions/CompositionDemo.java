package Compositions;

public class CompositionDemo
{
    public static void main(String[] args) {
        // (1) Create an Address object
        Address addr = new Address("123 Main St", "New York", "10001");
        Address addr1 = new Address("345 Second St", "Philadelphia", "19121");
        // (2) Create a Person object with the Address
        Person p = new Person("Alice", 25, addr);
        Person o = new Person("Mike", 45, addr1);

        // (3) Display all information
        p.displayPerson();
        o.displayPerson();
    }
}
