package Review_practice_activities_10_13_page2;

public class Step1_BreakThenContinue
{
    public static void main(String[] args) {
        // (1) Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {                            // (2) if we see 3
                System.out.println("Stopping at 3"); // (3) notify
                break;                               // (4) break out of loop
            }
            System.out.println(i);                   // (5) print numbers before 3
        }
        // (6) This runs after the loop finishes or breaks
        System.out.println("Loop finished — program continues here."); // (7)

    }
}
