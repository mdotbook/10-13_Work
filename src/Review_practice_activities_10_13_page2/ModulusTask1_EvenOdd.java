package Review_practice_activities_10_13_page2;

public class ModulusTask1_EvenOdd
{
    public static void main(String[] args) {
        int number = 7; // (1) store a sample number

        // (2) use modulus to find remainder when divided by 2
        if (number % 2 == 0) {
            System.out.println(number + " is even."); // (3) remainder 0 means even
        } else {
            System.out.println(number + " is odd."); // (4) remainder not 0 means odd
        }
        // (5) end of program

    }
}
