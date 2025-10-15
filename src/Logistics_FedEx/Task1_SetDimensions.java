package Logistics_FedEx;

public class Task1_SetDimensions
{

    public static void main(String[] args) {
        // (1) Create a PackagingBox object
        OB07_PackagingBox box1 = new OB07_PackagingBox();

        // (2) Set length, breadth, and height
        box1.setLength(5);
        box1.setBreadth(3);
        box1.setHeight(2);

        // (3) Print each dimension
        System.out.println("Length: " + box1.getLength());
        System.out.println("Breadth: " + box1.getBreadth());
        System.out.println("Height: " + box1.getHeight());

    }
}
