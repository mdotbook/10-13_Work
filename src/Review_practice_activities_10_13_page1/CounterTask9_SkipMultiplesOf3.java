package Review_practice_activities_10_13_page1;

public class CounterTask9_SkipMultiplesOf3
{
    public static void main(String[] args) {
        int counter = 1; // (1) start
        while (counter <= 10) { // (2) loop
            if (counter % 3 == 0) { // (3) skip multiples of 3
                counter++; // (4) increment before continue
                continue; // (5) skip printing
            }
            System.out.println("Counter = " + counter); // (6)
            counter++; // (7) next number
        }

    }
}
