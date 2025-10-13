package Review_practice_10_13_Array;

public class Task3_MaxAndMin
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 5, 6};

        System.out.println("Max number = " + max(someArray));
        System.out.println("Min number = " + min(someArray));
    }

    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++)
            if (arrayIn[i] > result)
                result = arrayIn[i];
        return result;
    }

    static int min(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++)
            if (arrayIn[i] < result)
                result = arrayIn[i];
        return result;

    }
}
