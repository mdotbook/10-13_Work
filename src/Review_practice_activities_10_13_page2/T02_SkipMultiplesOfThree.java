package Review_practice_activities_10_13_page2;

public class T02_SkipMultiplesOfThree
{
    public static void main(String[] args) {
        // (1) Loop from 1 to 9
        for (int i = 1; i <= 9; i++) {
            // (2) If multiple of 3, skip printing
            if (i % 3 == 0) {
                System.out.println("Skipping " + i + " because it's a multiple of 3");
                continue; // (3)
            }
            // (4) Print numbers not divisible by 3
            System.out.println(i);
        }

    }
}
