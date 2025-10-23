package Compositions;

public class Product
{
   private String model;
   private String manufacturer;

   // Constructor
    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    // Getters

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
