package Review_practice_activities_10_13_page2;

public class Task8_RunningTotal
{
    public static void main(String[] args) {
        int sum = 0; // (1) Start total
        for (int i = 1; i <= 5; i++) {
            sum += i; // (2) Add current number
            System.out.println("After adding " + i + ": total = " + sum); // (3) Show progress
        }

    }
}
