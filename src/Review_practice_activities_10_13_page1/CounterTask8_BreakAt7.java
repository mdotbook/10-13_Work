package Review_practice_activities_10_13_page1;

public class CounterTask8_BreakAt7
{
    public static void main(String[] args) {
        int counter = 1; // (1) start
        while (counter <= 10) { // (2) loop 1-10
            if (counter == 7) { // (3) stop condition
                System.out.println("Reached 7, stopping."); // (4)
                break; // (5) exit loop
            }
            System.out.println("Counter = " + counter); // (6)
            counter++; // (7)
        }

    }
}
