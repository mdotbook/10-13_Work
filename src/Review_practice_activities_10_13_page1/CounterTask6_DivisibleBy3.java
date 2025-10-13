package Review_practice_activities_10_13_page1;

public class CounterTask6_DivisibleBy3
{
    public static void main(String[] args) {
        int counter = 1; // (1) start
        while (counter <= 15) { // (2) loop
            if (counter % 3 == 0) { // (3) divisible by 3
                System.out.println(counter + " is divisible by 3"); // (4)
            }
            counter++; // (5) next number
        }
        // (6) done

    }
}
