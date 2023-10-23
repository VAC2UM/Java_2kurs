package Work_17.Task1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        //MVC - это шаблон проектирования, который разделяет приложение на три основных компонента:
        // модель, представление и контроллер.
        Student model = retriveStudentFromDataBASE();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updeteView();

        controller.setStudentName("Ryan Gosling");
        System.out.println("\nAfter updating, Student Details are as follows");
        controller.updeteView();
    }

    //устанавливаем изначальное значение
    public static Student retriveStudentFromDataBASE() {
        Student student = new Student();
        student.setName("Nikita");
        student.setRollNo("Programmer");
        return student;
    }
}
