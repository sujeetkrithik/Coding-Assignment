import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Employee {
    Scanner scan = new Scanner(System.in);
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("id = " + id );
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
        System.out.println();
    }

    public static void main(String[] args){
        Employee emp1 = new Employee(1, "Sujeet", 100000.0);
        Employee emp2 = new Employee(2, "Krithik", 200000.0);
        Employee emp3 = new Employee(3,"Sujeet Krithik", 500000.0);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);

        for(Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
