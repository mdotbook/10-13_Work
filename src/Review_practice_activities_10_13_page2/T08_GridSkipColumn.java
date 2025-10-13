package Review_practice_activities_10_13_page2;

public class T08_GridSkipColumn
{
    public static void main(String[] args) {
        // (1) Outer loop for rows
        for (int r = 1; r <= 3; r++) {
            // (2) Inner loop for columns
            for (int c = 1; c <= 4; c++) {
                // (3) Skip column 2
                if (c == 2) {
                    System.out.println("Skipping column 2 at row " + r);
                    continue; // (4)
                }
                // (5) Print cell for other columns
                System.out.println("cell (" + r + "," + c + ")");
            }
            System.out.println("--- end of row " + r + " ---");
        }

    }
}
