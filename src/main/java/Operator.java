public class Operator implements Employee {
    @Override
    public int getMonthSalary() {
        System.out.println("Зарплата складывается только из фиксированной части");
        return 0;
    }
}
