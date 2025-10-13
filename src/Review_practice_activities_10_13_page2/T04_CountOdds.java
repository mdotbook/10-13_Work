package Review_practice_activities_10_13_page2;

public class T04_CountOdds
{
    public static void main(String[] args) {
        int count = 0; // (1) number of odds found
        // (2) Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // (3) Skip even numbers
            if (i % 2 == 0) {
                continue; // (4)
            }
            // (5) i is odd — increment counter
            count++; // (6)
        }
        // (7) Print how many odd numbers there are
        System.out.println("Total odd numbers between 1 and 10: " + count); // should be 5

    }
}
