
import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> all = new ArrayList<>();
    {
        all.add(new Manager());
        all.add(new Operator());
        all.add(new TopManager());
    }

    public void hire(Employee employee) {
        System.out.println("Найм одного сотрудника");
        all.add(employee);
        int i = 0;
        for(Employee em: all) {
            System.out.println((++i) + " " + em);
        }
    }

    public void hireAll(List<Employee> employees) {
        System.out.println("Найм списка сотрудников");
        all.addAll(employees);
        System.out.println(all);
    }

    public void fire(int index) {
        System.out.println("Увольнение сотрудников");
        all.remove(index);
        System.out.println(all);
    }

    public void getIncome() {
        System.out.println("Получение значения дохода компании");
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }


}
