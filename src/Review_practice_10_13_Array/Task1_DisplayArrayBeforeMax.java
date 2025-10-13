package Review_practice_10_13_Array;

public class Task1_DisplayArrayBeforeMax
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 5, 6};

        System.out.println("Array elements are:");
        for (int num : someArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Max number is");
        System.out.println(max(someArray));
    }

    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++) {
            if (arrayIn[i] > result)
                result = arrayIn[i];
        }
        return result;

    }
}
