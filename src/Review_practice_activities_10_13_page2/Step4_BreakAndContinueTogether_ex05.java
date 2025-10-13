package Review_practice_activities_10_13_page2;

public class Step4_BreakAndContinueTogether_ex05
{
    public static void main(String[] args) {
        int sum = 0; // (1) running total
        // (2) Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // (3) Skip even numbers
            if (i % 2 == 0) {
                continue; // (4)
            }
            // (5) Add odd number to sum
            sum += i; // (6)
        }
        // (7) Print result
        System.out.println("Sum of odd numbers between 1 and 10 = " + sum); // should be 25


    }
}
