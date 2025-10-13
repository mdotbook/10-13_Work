package Review_practice_10_13_Array;

import java.util.Scanner;

public class s02h_HelperAskAndCheck
{
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10};
        Scanner sc = new Scanner(System.in);

        askAndCheck(sc, data);

        sc.close();
    }

    static void askAndCheck(Scanner sc, int[] arrayIn) {
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();

        if (contains(arrayIn, num))
            System.out.println("✅ Found in array!");
        else
            System.out.println("❌ Not found.");
    }

    static boolean contains(int[] arrayIn, int valueIn) {
        for (int n : arrayIn)
            if (n == valueIn) return true;
        return false;

    }
}
