package Review_practice_10_13_Array;

public class Task4_CountMax
{
    public static void main(String[] args) {
        int[] someArray = {9, 2, 8, 4, 9, 6};

        int maxValue = max(someArray);
        int count = 0;

        for (int num : someArray) {
            if (num == maxValue)
                count++;
        }

        System.out.println("Max value = " + maxValue);
        System.out.println("Appears " + count + " times");
    }

    static int max(int[] arrayIn) {
        int result = arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++)
            if (arrayIn[i] > result)
                result = arrayIn[i];
        return result;

    }
}
