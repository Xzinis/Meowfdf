public class Manager implements Employee {



    public int getMonthSalary(int salary) {
        int s = salary + rnd()/100*5;

        return s;
    }

    public static int rnd() {
        int max = 115000;
        int min = 140000;
        max -= min;
        int s = (int) (Math.random() * ++max) + min;
        return s;

    }

}
