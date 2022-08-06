public class TopManager implements Employee {

    public int getMonthSalary(int salary) {

        if (Company.getIncome() > 10000000) {
            int a = salary+salary/100*150;
//            System.out.println(a);
            return a;
        } else {
//            System.out.println(salary);
            return salary;

        }
    }
}
