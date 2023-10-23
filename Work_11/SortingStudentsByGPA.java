package Work_11;

import Work_6_9InNewFile.Student;

import java.util.Comparator;
import java.time.LocalDate;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по убыванию GPA
        return Double.compare(student2.getGPA(), student1.getGPA());
    }
}