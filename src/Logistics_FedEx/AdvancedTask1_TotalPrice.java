package Logistics_FedEx;

public class AdvancedTask1_TotalPrice {
    public static void main(String[] args) {
        // (1) Create array of 3 boxes
        OB07_PackagingBox[] boxes = new OB07_PackagingBox[3];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new OB07_PackagingBox();
        }

        // (2) Set prices
        boxes[0].setPrice(10);
        boxes[1].setPrice(15);
        boxes[2].setPrice(20);

        // (3) Calculate total price
        double totalPrice = 0;
        for (OB07_PackagingBox b : boxes) {
            totalPrice += b.getPrice(); // (4) add each box price
        }

        // (5) Print total price
        System.out.println("Total price of all boxes: " + totalPrice);

    }
}