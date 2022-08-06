
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    public int salary;

    public Company(int salary) {
        this.salary = salary;
    }

    List<Employee> all = new ArrayList<>();

    public int count() {
        return all.size();
    }

    public void hire(Employee employee) {
        all.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        all.addAll(employees);
    }

    public void fire(Employee employee) {
        all.remove(employee);
    }

    public static int getIncome() {
        return 20000000;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> f = new ArrayList<>();
        List<Employee> a = all.stream().sorted(Comparator.comparing(employee -> employee.getMonthSalary(150000))).collect(Collectors.toList());
        for (int i = 0; i < count; i++) {
            f.add(a.get(i));
        }
        return f;
    }

    public List<Employee> getTopSalaryStaff(int count) {

        return getFilteredLimitedList(count, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o2.getMonthSalary(150000000) - o1.getMonthSalary(150000000);
            }
        });
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<Employee>(all);
        Collections.sort(copyList, comparator);
        List<Employee> result = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }



}
