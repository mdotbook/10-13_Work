package Logistics_FedEx;

public class Task2_ComputeVolume
{
    public static void main(String[] args) {
        // Create a box
        OB07_PackagingBox box2 = new OB07_PackagingBox();

        // Set dimensions
        box2.setLength(4);
        box2.setBreadth(2);
        box2.setHeight(6);

        // Compute volume
        box2.computeVolume();

        // Print the volume
        System.out.println("Volume of the box: " + box2.getVolume());
    }
}
