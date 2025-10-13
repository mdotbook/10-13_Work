package Review_practice_10_13_Array;

import java.util.Scanner;

/*
 (1) This program demonstrates array membership and search.
     - contains(...) returns true/false if value present
     - indexOf(...) returns index of first occurrence, or -1 if not found
     The program asks the user for the value to search and prints results.
*/
public class s02c_ArraysMembership_ExerciseSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // (2) Scanner to read user input

        // (3) Example array (base task uses a prefilled array)
        int[] someArray = {9, 2, 8, 4, 5, 6};                 // (3a) you can change these numbers or implement modification A

        // (4) Tell the user what we will do
        System.out.println("Array contents:");
        for (int i = 0; i < someArray.length; i++) {          // (4a) show the array to the user
            System.out.print(someArray[i] + (i < someArray.length - 1 ? ", " : "\n"));
        }

        // (5) Prompt user for the number to search
        System.out.print("Enter value to search: ");
        String line = sc.nextLine().trim();                   // (5a) read line as text

        // (6) Try to parse the user's input to an integer safely
        int valueToFind;
        try {
            valueToFind = Integer.parseInt(line);             // (6a) convert text to int
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered. Program will exit."); // (6b)
            sc.close();                                       // (6c) close scanner before exit
            return;                                           // (6d) exit main
        }

        // (7) Use contains(...) to get boolean result
        boolean present = contains(someArray, valueToFind);   // (7a)

        // (8) Use indexOf(...) to get index result (first occurrence)
        int index = indexOf(someArray, valueToFind);          // (8a)

        // (9) Print results in a clear way
        System.out.println();
        System.out.println("Search value: " + valueToFind);   // (9a)
        System.out.println("Is present? : " + present);       // (9b)
        if (index == -1) {
            System.out.println("Index       : Not found (returned -1)"); // (9c)
        } else {
            System.out.println("Index       : " + index);    // (9d)
        }

        sc.close();                                           // (10) close Scanner
    }

    static boolean contains(int[] arrayIn, int valueIn) {
        // (12) for-each loop checks every element
        for (int currentElement : arrayIn) {
            if (currentElement == valueIn) {                 // (12a) found a match
                return true;                                 // (12b) return true immediately
            }
        }
        return false;                                        // (13) not found
    }

    /*
     (14) indexOf:
          - INPUT: an int array and a value to find
          - OUTPUT: index of first occurrence, or -1 if not found
    */
    static int indexOf(int[] arrayIn, int valueIn) {
        // (15) regular for loop needed to track index
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == valueIn) {                    // (15a) found a match
                return i;                                    // (15b) return index immediately
            }
        }
        return -1;                                           // (16) not found
    }
}










