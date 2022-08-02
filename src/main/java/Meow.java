import java.util.ArrayList;
import java.util.Scanner;

public class Meow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doIt d = new doIt();

        ArrayList<String> arrs;
        {
            arrs = new ArrayList<>();
            arrs.add("dfdfdfds");
            arrs.add("dsdvvvvv");
            arrs.add("eeeeeeeeee");
            arrs.add("ggggggggg");
        }
        String a = sc.next();
        String s = "";
        int ds = 0;
        Object[] sd = new Object[0];

        if (sc.hasNext()) {
            while (sc.hasNext()) {
                s = s + sc.next() + " ";
            }
            ds = s.split(" ").length;
            sd = s.split(" ");
        }
        int w = 0;
        String num = "";

        switch (a) {
            case ("LIST"):
                sout(arrs);
                break;
            case ("ADD"):
                if (w == 0) {
                    if (ds == 1) {
                        num = (String) sd[0];
                        ArrayList<String> arr = d.add(num, arrs);
                        sout(arr);
                    } else {
                        w = Integer.parseInt((String) sd[0]);
                        num = (String) sd[1];
                        ArrayList<String> arr = d.add(num, w, arrs);
                        sout(arr);
                    }
                }
                break;

            case ("EDIT"):
                    w = Integer.parseInt((String) sd[0]);
                    num = (String) sd[1];
                ArrayList<String> arr = d.edit(num, w, arrs);
               sout(arr);
                break;

            case ("DELETE"):
                w = Integer.parseInt((String) sd[0]);
                ArrayList<String> arrd = d.delete(w, arrs);
                sout(arrd);
                break;
        }
    }

    private static void sout(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

