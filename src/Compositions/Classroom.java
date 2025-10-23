package Compositions;

public class Classroom {
    Subject[] subjects; // array of subjects

    Classroom(Subject[] subjects) { // Constructor
        this.subjects = subjects;
    }
    void totalMarks() {  // compute total
        int total = 0; // initialize sum
        for (Subject s : subjects) {  // for-each
            total += s.marks;  // sum marks
        }
        System.out.println("Total Marks: " + total);
    }
}
