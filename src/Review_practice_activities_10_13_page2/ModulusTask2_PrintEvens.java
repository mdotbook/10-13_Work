package Review_practice_activities_10_13_page2;

public class ModulusTask2_PrintEvens
{
    public static void main(String[] args) {
        // (1) Loop numbers 1 through 10
        for (int i = 1; i <= 10; i++) {
            // (2) check if i is divisible by 2 (no remainder)
            if (i % 2 == 0) {
                System.out.println("Even number: " + i); // (3) print even number
            }
        }
        // (4) done looping

    }
}
