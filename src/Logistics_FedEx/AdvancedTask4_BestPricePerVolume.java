package Logistics_FedEx;

public class AdvancedTask4_BestPricePerVolume
{
    public static void main(String[] args) {
        OB07_PackagingBox[] boxes = new OB07_PackagingBox[3];
        for (int i = 0; i < boxes.length; i++) boxes[i] = new OB07_PackagingBox();
        // Set dimensions and prices
        boxes[0].setLength(2);
        boxes[0].setBreadth(3);
        boxes[0].setHeight(4);
        boxes[0].setPrice(20);

        boxes[1].setLength(1);
        boxes[1].setBreadth(2);
        boxes[1].setHeight(5);
        boxes[1].setPrice(10);

        boxes[2].setLength(3);
        boxes[2].setBreadth(2);
        boxes[2].setHeight(3);
        boxes[2].setPrice(18);

        // Compute volume
        for (OB07_PackagingBox b : boxes) b.computeVolume();

        // Find best price/volume
        double bestRatio = boxes[0].getPrice() / boxes[0].getVolume();
        int bestIndex = 0;
        for (int i = 1; i < boxes.length; i++) {
            double ratio = boxes[i].getPrice() / boxes[i].getVolume();
            if (ratio < bestRatio) {
                bestRatio = ratio;
                bestIndex = i;
            }
        }

        //Print best value box
        System.out.println("Box with best price per volume: ");
        System.out.println("Volume: " + boxes[bestIndex].getVolume() + ", Price: " + boxes[bestIndex].getPrice());

    }
}
