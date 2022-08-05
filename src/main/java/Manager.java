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
        System.out.println("Зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных" +
                " для компании денег. Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.");
        return 0;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                '}';
    }
}
