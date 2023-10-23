package Work_17.Task2;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Employee model = retriveEmployeeFromDataBASE();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Ryan Gosling");
        System.out.println("\nAfter updating, Student Details are as follows");
        controller.setEmployeeSalary(100000000000.0);
        controller.updateView();
    }

    public static Employee retriveEmployeeFromDataBASE() {
        Employee employee = new Employee("Nikita", 15000.0);
        return employee;
    }

}

