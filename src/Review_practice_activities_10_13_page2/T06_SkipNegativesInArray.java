package Review_practice_activities_10_13_page2;

public class T06_SkipNegativesInArray
{
    public static void main(String[] args) {
        int[] values = {4, -1, 0, 7, -3, 2}; // (1) sample array
        // (2) Loop through each element
        for (int v : values) {
            // (3) Skip negative values
            if (v < 0) {
                System.out.println("Skipping negative: " + v);
                continue; // (4)
            }
            // (5) Print non-negative values
            System.out.println("Value: " + v);
        }

    }
}
