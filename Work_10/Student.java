package Work_10;

public class Student implements Comparable<Student>{
    private String name;
    private String secondName;
    private int id;
    private double GPA;

    private String group;
    private String course;
    private String special;

    @Override
    public int compareTo(Student otherStudent) {
        // Сравниваем студентов по их итоговым баллам
        if (this.GPA < otherStudent.GPA) {
            return -1;
        }
        else if (this.GPA > otherStudent.GPA) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public Student(String name, String secondName, int id, double GPA, String group, String course, String special) {
        this.name = name;
        this.secondName = secondName;
        this.id = id;
        this.GPA = GPA;
        this.group = group;
        this.course = course;
        this.special = special;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + secondName +
                ", ID студента: " + id + ", GPA студента: " + GPA + ", группа: " + group + ", курс: " + course + ", специальность: " + special;
    }
}