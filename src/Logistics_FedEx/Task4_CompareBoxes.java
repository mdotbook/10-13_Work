package Logistics_FedEx;

public class Task4_CompareBoxes
{
    public static void main(String[] args) {
        // Create two boxes
        OB07_PackagingBox box4 = new OB07_PackagingBox();
        OB07_PackagingBox box5 = new OB07_PackagingBox();

        // Set dimensions
        box4.setLength(4); box4.setBreadth(3); box4.setHeight(2);
        box5.setLength(5); box5.setBreadth(2); box5.setHeight(2);

        // Compute volumes
        box4.computeVolume();
        box5.computeVolume();

        // Compare volumes
        if (box4.getVolume() > box5.getVolume()) {
            System.out.println("Box4 is bigger with volume " + box4.getVolume());
        } else {
            System.out.println("Box5 is bigger with volume " + box5.getVolume());
        }
    }
}
