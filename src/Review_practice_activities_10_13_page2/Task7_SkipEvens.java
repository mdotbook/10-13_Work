package Review_practice_activities_10_13_page2;

public class Task7_SkipEvens
{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // (1) Skip even
                continue; // (2) Jump to next iteration
            }
            System.out.println(i); // (3) Print odd number
        }

    }
}
