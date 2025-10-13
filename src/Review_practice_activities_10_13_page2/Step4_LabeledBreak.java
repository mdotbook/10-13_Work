package Review_practice_activities_10_13_page2;

public class Step4_LabeledBreak
{
    public static void main(String[] args) {
        // (1) Label the outer loop so inner loop can break out of it
        outer:
        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= 5; c++) {
                if (c == 3) {
                    // (2) break with label: exits the outer loop entirely
                    System.out.println("Found c==3 — breaking out of both loops.");
                    break outer; // (2a)
                }
                System.out.println("cell (" + r + "," + c + ")");
            }
        }
        // (3) Execution lands here after labeled break
        System.out.println("Both loops stopped (labeled break).");

    }
}
