package Review_practice_activities_10_13_page1;

public class CounterTask5_Sum1to5
{
    public static void main(String[] args) {
        int counter = 1; // (1) start counter
        int sum = 0;     // (2) initialize sum
        while (counter <= 5) { // (3) loop 1-5
            sum += counter; // (4) add counter to sum
            System.out.println("Counter = " + counter + ", Sum so far = " + sum); // (5)
            counter++; // (6) increase counter
        }
        System.out.println("Total sum = " + sum); // (7) final sum

    }
}
