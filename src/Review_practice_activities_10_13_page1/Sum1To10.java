package Review_practice_activities_10_13_page1;

public class Sum1To10
{
    public static void main(String[] args) {
        int sum = 0;                 // (1) Initialize sum
        for (int i = 1; i <= 10; i++) { // (2) Loop 1 to 10
            sum += i;                // (3) Add i to sum
        }
        System.out.println("Sum = " + sum); // (4) Print sum

    }
}
