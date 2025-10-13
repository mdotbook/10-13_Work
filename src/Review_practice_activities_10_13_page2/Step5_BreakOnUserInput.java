package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class Step5_BreakOnUserInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               // (1) scanner for user input

        System.out.println("Type words. Type 'stop' to end.");
        while (true) {                                     // (2) loop forever until break
            System.out.print("Enter a word: ");
            String word = sc.nextLine().trim();           // (3) read user input

            if (word.equalsIgnoreCase("stop")) {          // (4) check stop condition
                System.out.println("Stop command received — exiting loop.");
                break;                                    // (4a) leave loop
            }
            // (5) if not 'stop', show what user typed
            System.out.println("You typed: " + word);
        }

        sc.close();                                       // (6) close scanner
        System.out.println("Program ended.");

    }
}
