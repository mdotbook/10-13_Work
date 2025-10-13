package Review_practice_activities_10_13_page2;

public class Step3_NestedBreakInnerOnly
{
    public static void main(String[] args) {
        // (1) Outer loop: rows 1..3
        for (int r = 1; r <= 3; r++) {
            System.out.println("Row " + r + ":");
            // (2) Inner loop: columns 1..5
            for (int c = 1; c <= 5; c++) {
                // (3) If column equals 3, stop the inner loop for this row
                if (c == 3) {
                    System.out.println("  reached column 3 — breaking inner loop");
                    break; // (3a) stops only the inner loop
                }
                // (4) Print cell coordinates
                System.out.println("  cell (" + r + "," + c + ")");
            }
            // (5) After inner loop ends (either finished or broke), continue outer loop
            System.out.println("--- end of row " + r + " ---");
        }

    }
}
