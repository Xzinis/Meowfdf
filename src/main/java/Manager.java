public class Manager implements Employee {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int getMonthSalary() {
        System.out.println("�������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������" +
                " ��� �������� �����. ���������� ������������ ����� ��� �������� ����������� ��������� ������� �� 115 000 �� 140 000 ������.");
        return 0;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                '}';
    }
}
