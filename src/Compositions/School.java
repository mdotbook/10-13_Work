package Compositions;

public class School
{
    Student[] students;  // array of students

    School(Student[] students) {  // constructor
        this.students = students;
    }

    void displayStudents() {  // display all students
        System.out.println("Students List: ");
        for (Student s : students) {  // for-each loop
            System.out.printf("Name: %s, Grade: %d%n", s.name, s.grade);
        }
    }

}
