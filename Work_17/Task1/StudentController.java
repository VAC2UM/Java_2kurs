package Work_17.Task1;

//класс, который действует как контроллер
//контроллер - это класс, который может обновлять модель и вид
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updeteView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }

}
