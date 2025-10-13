package Review_practice_activities_10_13_page2;

import java.util.Scanner;

public class T10_FilterByThreshold
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // (1)
        int[] values = {2, 9, 5, 12, 3, 8};  // (2) sample values

        System.out.print("Enter threshold (print numbers >= threshold): ");
        int threshold = sc.nextInt(); sc.nextLine(); // (3)

        System.out.println("Numbers >= " + threshold + ":");
        // (4) Loop and skip values below threshold
        for (int v : values) {
            if (v < threshold) {
                // (5) skip small numbers
                continue;
            }
            // (6) print values meeting condition
            System.out.println(v);
        }

        sc.close(); // (7)

    }
}
