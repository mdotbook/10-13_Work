package Review_practice_activities_10_13_page2;

public class ModulusTask3_PrintOdds
{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // (1) count 1–10
            if (i % 2 != 0) { // (2) odd means remainder not 0
                System.out.println("Odd number: " + i); // (3) print odd
            }
        }
        // (4) end of loop

    }
}
