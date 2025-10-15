package Logistics_FedEx;

public class Task3_BoxWeightPrice
{
    public static void main(String[] args) {
        // Create box
        OB07_PackagingBox box3 = new OB07_PackagingBox();

        // Set dimensions
        box3.setLength(3);
        box3.setBreadth(2);
        box3.setHeight(5);

        // Set weight and price
        box3.setWeight(10.5);
        box3.setPrice(20.0);

        // Compute volume
        box3.computeVolume();

        // Print all properties
        System.out.println("Length: " + box3.getLength());
        System.out.println("Breadth: " + box3.getBreadth());
        System.out.println("Height: " + box3.getHeight());
        System.out.println("Weight: " + box3.getWeight());
        System.out.println("Price: " + box3.getPrice());
        System.out.println("Volume" + box3.getVolume());
    }
}
