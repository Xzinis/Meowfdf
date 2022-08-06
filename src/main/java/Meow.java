import java.util.ArrayList;
import java.util.List;

public class Meow {
    public static void main(String[] args) {
    Company company = new Company(150000);


        {
            for (int i = 0; i < 80; i++) {
                company.hire(new Manager());
            }

            for (int i = 0; i < 180; i++) {
                company.hire(new Operator());
            }

            for (int i = 0; i < 10; i++) {
                company.hire(new TopManager());
            }
        }


        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));
        System.out.println(company.all.size());
        int a = company.count();
        for (int i = 0; i < a/2; i++) {
            company.fire(company.all.get(i));
        }
        System.out.println(company.all.size());

        System.out.println(company.getTopSalaryStaff(15));
        System.out.println(company.getLowestSalaryStaff(30));


    }
}

