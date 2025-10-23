package Compositions;

public class Address
{
    String street;   // (2) Street name
    String city;     // (3) City name
    String zipCode;  // (4) ZIP code

    // (5) Constructor to initialize Address
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // (6) Method to display the address
    public void displayAddress() {
        System.out.println(street + ", " + city + " - " + zipCode);
    }

}
