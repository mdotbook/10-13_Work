package Logistics_FedEx;

public class AdvancedTask3_SortByVolume
{
    public static void main(String[] args) {
        OB07_PackagingBox[] boxes = new OB07_PackagingBox[3];
        for (int i = 0; i < boxes.length; i++) boxes[i] = new OB07_PackagingBox();

        // Set dimensions
        boxes[0].setLength(2);
        boxes[0].setBreadth(3);
        boxes[0].setHeight(4);

        boxes[1].setLength(1);
        boxes[1].setBreadth(2);
        boxes[1].setHeight(5);

        boxes[2].setLength(3);
        boxes[2].setBreadth(2);
        boxes[2].setHeight(3);

        // Compute volume
        for (OB07_PackagingBox b : boxes) b.computeVolume();

        //Sort boxes by volume (simple bubble sort)
        for (int i = 0; i < boxes.length -1; i++) {
            for (int j = 0; j < boxes.length -i-1; j++) {
                if (boxes[j].getVolume() > boxes[j + 1].getVolume()) {
                    OB07_PackagingBox temp = boxes[j];
                    boxes[j] = boxes[j + 1];
                    boxes[j + 1] = temp;
                }
            }
        }
        System.out.println("Boxes sorted by volume: ");
        for (OB07_PackagingBox b : boxes) {
            System.out.println(b.getVolume());
        }
    }
}
