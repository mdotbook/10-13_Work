package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T09_SkipEmptyInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // (1)
        System.out.println("Type words (empty line is skipped). Type 'quit' to end.");

        while (true) { // (2)
            System.out.print("Input: ");
            String line = sc.nextLine(); // (3)

            // (4) Skip empty lines
            if (line.trim().isEmpty()) {
                System.out.println("Empty input — skipped.");
                continue; // (5)
            }

            // (6) Stop if user types 'quit'
            if (line.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break; // (7)
            }

            // (8) Print the non-empty line
            System.out.println("You typed: " + line);
        }

        sc.close(); // (9)

    }
}
