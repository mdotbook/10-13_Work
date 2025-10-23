package Compositions;

public class Person
{
    String name;        // (2) Person's name
    int age;            // (3) Person's age
    Address address;    // (4) Composition: Person "has an" Address

    // (5) Constructor to initialize Person and their Address
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // (6) Method to display person info including address
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Address: ");
        address.displayAddress(); // (7) Call method from Address class
    }

}
