package Review_practice_activities_10_13_page2;

public class Task10_StarPattern
{
    public static void main(String[] args) {
        // (1) Outer loop = rows
        for (int i = 1; i <= 5; i++) {
            // (2) Inner loop = columns/stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // (3) Print star
            }
            System.out.println(); // (4) Newline after each row
        }

    }
}
