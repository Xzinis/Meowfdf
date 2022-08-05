import java.util.ArrayList;
import java.util.List;

public class Meow {
    public static void main(String[] args) {
    Company company = new Company();
    company.hire(new Manager());
    List<Employee> employees = new ArrayList<>();
    employees.add(new TopManager());
    employees.add(new TopManager());
    company.hireAll(employees);
    company.fire(5);

    }
}

