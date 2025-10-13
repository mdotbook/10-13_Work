package Review_practice_activities_10_13_page2;

public class Task9_OddSquares
{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // (1) Only odd numbers
                int square = i * i; // (2) Square
                System.out.println(i + "^2 = " + square); // (3) Show
            }
        }

    }
}
