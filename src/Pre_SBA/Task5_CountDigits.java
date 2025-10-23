package Pre_SBA;

public class Task5_CountDigits
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // (2) Read input
        int count = 0;          // (3) Initialize count

        while(num > 0) {        // (4) Loop to count digits
            num /= 10;          // (5) Remove last digit
            count++;            // (6) Increment count
        }

        System.out.println("Number of digits: " + count); // (7) Output count
    }
}


