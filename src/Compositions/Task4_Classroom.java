package Compositions;

public class Task4_Classroom
{
    public static void main(String[] args) {
        Subject[] subArr = {
                new Subject("Math", 85),
                new Subject("Science", 90),
                new Subject("Englis", 80)
        };
        Classroom cls = new Classroom(subArr);  // Create classroom
        cls.totalMarks();  // compute total
    }
}
