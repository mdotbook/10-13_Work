package Review_practice_activities_10_13_page1;

public class CounterTask7_MultiplesOf4
{
    public static void main(String[] args) {
        int counter = 1; // (1) start
        while (counter <= 20) { // (2) loop
            if (counter % 4 == 0) { // (3) multiple of 4
                System.out.println(counter + " is a multiple of 4"); // (4)
            }
            counter++; // (5) next number

        }
    }
}
