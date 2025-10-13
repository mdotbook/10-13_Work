package Review_practice_10_13_Array;

import java.util.Scanner;

public class s01b_ask_user_to_determine_size_of_array_with_display
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] someArray;

        System.out.println("How many elements to store?");
        int size = keyboard.nextInt();

        someArray = new int[size];
        displayTemps(someArray); // Call method

        keyboard.close();
    }

    static void displayTemps(int[] temperatureIn) {
        System.out.println();
        System.out.println("*** Your Array size is *** " + temperatureIn.length);
        System.out.println();

    }
}
