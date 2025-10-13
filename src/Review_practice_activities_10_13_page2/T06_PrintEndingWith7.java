package Review_practice_activities_10_13_page2;

public class T06_PrintEndingWith7
{
    public static void main(String[] args) {
        int[] arr = {7, 17, 20, 27, 33, 47, 70};        // (1) sample array

        System.out.println("Numbers ending with 7:");
        for (int v : arr) {                             // (2) loop elements
            if (v % 10 == 7) {                          // (3) last digit check
                System.out.println(v);                  // (4)
            }
        }

    }
}
