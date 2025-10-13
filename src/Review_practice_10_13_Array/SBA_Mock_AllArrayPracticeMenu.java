package Review_practice_10_13_Array;

import java.util.Scanner;

public class SBA_Mock_AllArrayPracticeMenu
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // (2) single Scanner used everywhere

        // (3) Ask user how many elements to store and create array
        System.out.print("How many elements to store?: ");
        int size = readPositiveInt(keyboard);
        int[] someArray = new int[size]; // (4) array with user-defined size

        // (5) menu loop variable
        int choice;

        // (6) main menu loop - choose actions until exit (choice 0)
        do {
            printMenu(); // (7) show menu options
            choice = readMenuChoice(keyboard); // (8) safe menu input

            switch (choice) {
                case 1: // Enter values
                    fillArray(someArray, keyboard); // (9)
                    break;
                case 2: // Find maximum
                    if (arrayHasValues(someArray)) {
                        System.out.println("Maximum array value = " + max(someArray)); // (10)
                    } else {
                        System.out.println("Array is empty or not filled yet.");
                    }
                    break;
                case 3: // Calculate sum
                    System.out.println("Sum of array values = " + sum(someArray)); // (11)
                    break;
                case 4: // Check membership
                    System.out.print("Enter value to find: ");
                    int value = keyboard.nextInt(); keyboard.nextLine(); // consume newline
                    System.out.println(contains(someArray, value) ? value + " is in the array" : value + " is not in the array"); // (12)
                    break;
                case 5: // Search array (index)
                    System.out.print("Enter value to find: ");
                    int item = keyboard.nextInt(); keyboard.nextLine();
                    int index = search(someArray, item);
                    System.out.println(index == -999 ? "This value is not in the array" : "This value is at array index " + index); // (13)
                    break;
                case 6: // Display values
                    System.out.println("Array values:"); displayArray(someArray); // (14)
                    break;
                case 7: // Average of array values
                    if (someArray.length > 0) averageArray(someArray); else System.out.println("Array length is zero."); // (15)
                    break;
                case 8: // Count occurrences
                    countOccurrences(someArray, keyboard); // (16)
                    break;
                case 9: // Display reverse
                    displayReverse(someArray); // (17)
                    break;
                case 10: // Find minimum
                    if (arrayHasValues(someArray)) {
                        System.out.println("Minimum value = " + findMinimum(someArray)); // (18)
                    } else {
                        System.out.println("Array is empty or not filled yet.");
                    }
                    break;
                case 11: // Replace value
                    replaceValue(someArray, keyboard); // (19)
                    break;
                case 0: // Exit
                    System.out.println("Goodbye!"); // (20)
                    break;
                default:
                    System.out.println("Please choose a valid option (0-11)."); // (21)
            }

        } while (choice != 0);

        keyboard.close(); // (22) close Scanner
    }

    // ---------- Utility / UI methods ----------

    static void printMenu() {
        System.out.println();
        System.out.println("Menu:");
        System.out.println("[1] Enter values");
        System.out.println("[2] Find maximum");
        System.out.println("[3] Calculate sum");
        System.out.println("[4] Check membership");
        System.out.println("[5] Search array (index)");
        System.out.println("[6] Display values");
        System.out.println("[7] Average of array values");
        System.out.println("[8] Count occurrences");
        System.out.println("[9] Display array in reverse");
        System.out.println("[10] Find minimum value");
        System.out.println("[11] Replace value");
        System.out.println("[0] Exit");
        System.out.print("Enter choice [0-11]: ");
    }

    // read menu choice safely (int)
    static int readMenuChoice(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                int c = Integer.parseInt(line);
                return c;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number for menu choice: ");
            }
        }
    }

    // read a positive integer (for array size)
    static int readPositiveInt(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                int v = Integer.parseInt(line);
                if (v >= 0) return v;
                System.out.print("Please enter 0 or a positive integer: ");
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }

    static boolean arrayHasValues(int[] arrayIn) {
        return arrayIn != null && arrayIn.length > 0;
    }

    // ---------- Task methods (1-10) ----------

    // (9) Fill the array with user input
    static void fillArray(int[] arrayIn, Scanner sc) {
        System.out.println("Enter values for array (total " + arrayIn.length + "):");
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print("Enter value for array[" + i + "]: ");
            // reuse safe int read
            arrayIn[i] = readAnyInt(sc);
        }
    }

    // safe int reader used by fillArray and others
    static int readAnyInt(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Please type an integer: ");
            }
        }
    }

    // (11) Sum of array
    static int sum(int[] arrayIn) {
        int total = 0;
        for (int n : arrayIn) total += n;
        return total;
    }

    // (10) Maximum value
    static int max(int[] arrayIn) {
        if (arrayIn.length == 0) return Integer.MIN_VALUE;
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++) if (arrayIn[i] > result) result = arrayIn[i];
        return result;
    }

    // (12) Contains?
    static boolean contains(int[] arrayIn, int valueIn) {
        for (int n : arrayIn) if (n == valueIn) return true;
        return false;
    }

    // (13) Search returns index or -999
    static int search(int[] arrayIn, int valueIn) {
        for (int i = 0; i < arrayIn.length; i++) if (arrayIn[i] == valueIn) return i;
        return -999;
    }

    // (14) Display array values
    static void displayArray(int[] arrayIn) {
        if (arrayIn.length == 0) {
            System.out.println("(empty array)");
            return;
        }
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("array[" + i + "] = " + arrayIn[i]);
        }
    }

    // (15) Average of array values
    static void averageArray(int[] arrayIn) {
        if (arrayIn.length == 0) {
            System.out.println("Cannot compute average of empty array.");
            return;
        }
        double avg = (double) sum(arrayIn) / arrayIn.length;
        System.out.println("Average of array = " + avg);
    }

    // (16) Count occurrences of a value (asks user for value)
    static void countOccurrences(int[] arrayIn, Scanner sc) {
        System.out.print("Enter number to count: ");
        int value = readAnyInt(sc);
        int count = 0;
        for (int n : arrayIn) if (n == value) count++;
        System.out.println(value + " occurs " + count + " time(s).");
    }

    // (17) Display array in reverse order
    static void displayReverse(int[] arrayIn) {
        if (arrayIn.length == 0) {
            System.out.println("(empty array)");
            return;
        }
        System.out.println("Array in reverse order:");
        for (int i = arrayIn.length - 1; i >= 0; i--) {
            System.out.println("array[" + i + "] = " + arrayIn[i]);
        }
    }

    // (18) Find minimum value
    static int findMinimum(int[] arrayIn) {
        if (arrayIn.length == 0) return Integer.MAX_VALUE;
        int min = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++) if (arrayIn[i] < min) min = arrayIn[i];
        return min;
    }

    // (19) Replace all occurrences of oldValue with newValue (asks user)
    static void replaceValue(int[] arrayIn, Scanner sc) {
        System.out.print("Enter value to replace: ");
        int oldValue = readAnyInt(sc);
        System.out.print("Enter new value: ");
        int newValue = readAnyInt(sc);
        int replaced = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] == oldValue) { arrayIn[i] = newValue; replaced++; }
        }
        System.out.println("Replaced " + replaced + " occurrence(s). Updated array:");
        displayArray(arrayIn);
    }

}

