import java.util.ArrayList;

public class doIt {

    public ArrayList<String> add(String a, ArrayList<String> arrs) {
        arrs.add(a);
        return arrs;
    }

    public ArrayList<String> add(String a, int number, ArrayList<String> arrs) {
        arrs.add(number, a);
        return arrs;
    }

    public ArrayList<String> edit(String a, int number, ArrayList<String> arrs) {
        arrs.set(number, a);
        return arrs;
    }

    public ArrayList<String> delete(int number, ArrayList<String> arrs) {
       arrs.remove(number);
        return arrs;
     }
}
