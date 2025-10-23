package Pre_SBA;

public class Task6_ProductDigits
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); // (1) Scanner

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // (2) Read number

        int product = 1; // (3) Initialize product

        while(num > 0) {       // (4) Loop through digits
            int digit = num % 10;     // (5) Extract last digit
            product *= digit;         // (6) Multiply product
            num /= 10;                // (7) Remove last digit
        }

        System.out.println("Product of digits: " + product); // (8) Output product
    }

}
