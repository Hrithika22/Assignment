import java.util.ArrayList;
import java.util.List;

class Employee {
    //attributes of emp
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //employee details method
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "ABC", 51000.0);
        Employee emp2 = new Employee(102, "Xyz", 64000.0);
        Employee emp3 = new Employee(103, "Uvw", 55000.0);

        //strogin emp in list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

       
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
