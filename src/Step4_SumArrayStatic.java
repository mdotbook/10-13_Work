public class Step4_SumArrayStatic
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4}; // (1) sample array
        int total = sumArray(numbers); // (2) call static method with array
        System.out.println("Total sum = " + total); // (3) print returned sum
    }

    // (4) static method accepts an array and returns the sum of its elements
    public static int sumArray(int[] arr) {
        int sum = 0; // (5) accumulate total
        for (int n : arr) { // (6) loop through each element
            sum += n; // (7) add to sum
        }
        return sum; // (8) return final sum
    }

}
