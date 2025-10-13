package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T07_LeapYear
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // (1)
        System.out.print("Enter year: ");                  // (2)
        int year = sc.nextInt();                           // (3)

        // (4) leap year rules using modulus
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;                                 // (5)
        } else if (year % 100 == 0) {
            isLeap = false;                                // (6)
        } else if (year % 4 == 0) {
            isLeap = true;                                 // (7)
        } else {
            isLeap = false;                                // (8)
        }

        System.out.println(year + (isLeap ? " is a leap year." : " is NOT a leap year.")); // (9)
        sc.close();

    }
}
