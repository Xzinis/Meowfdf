
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
        System.out.println("���� ������ ����������");
        all.add(employee);
        int i = 0;
        for(Employee em: all) {
            System.out.println((++i) + " " + em);
        }
    }

    public void hireAll(List<Employee> employees) {
        System.out.println("���� ������ �����������");
        all.addAll(employees);
        System.out.println(all);
    }

    public void fire(int index) {
        System.out.println("���������� �����������");
        all.remove(index);
        System.out.println(all);
    }

    public void getIncome() {
        System.out.println("��������� �������� ������ ��������");
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }


}
