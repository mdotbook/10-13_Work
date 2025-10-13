package Review_practice_activities_10_13_page1;

public class CounterTask10_CountDownStop2
{
    public static void main(String[] args) {
        int counter = 5; // (1) start at 5
        while (counter >= 1) { // (2) loop downwards
            if (counter == 2) { // (3) stop at 2
                System.out.println("Reached 2, stopping"); // (4)
                break; // (5) exit
            }
            System.out.println("Counter = " + counter); // (6)
            counter--; // (7) decrease counter
        }

    }
}
