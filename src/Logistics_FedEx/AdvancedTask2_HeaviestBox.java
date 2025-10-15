package Logistics_FedEx;

public class AdvancedTask2_HeaviestBox
{
    public static void main(String[] args) {
        // Create boxes
        OB07_PackagingBox box6 = new OB07_PackagingBox();
        OB07_PackagingBox box7 = new OB07_PackagingBox();
        OB07_PackagingBox box8 = new OB07_PackagingBox();

        // Set weights
        box6.setWeight(5);
        box7.setWeight(8);
        box8.setWeight(6);

        // Determine heaviest
        double heaviest = box6.getWeight();
        if (box7.getWeight() > heaviest) heaviest = box7.getWeight();
        if (box8.getWeight() > heaviest) heaviest = box8.getWeight();

        // Print heaviest weight
        System.out.println("Heaviest box weight: " + heaviest);
    }
}
