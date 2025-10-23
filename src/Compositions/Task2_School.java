package Compositions;

public class Task2_School
{
    public static void main(String[] args) {

    Student[] stArr = {
            new Student("John", 90),
            new Student("Emma", 85),
            new Student("Liam", 78)
    };
    // Create student array
    School school = new School(stArr);  // Create school
    school.displayStudents();  // display students
    }
}


