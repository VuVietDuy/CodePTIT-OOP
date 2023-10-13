import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TreeSet<String> s = new TreeSet<>();

        s.add("vu viet duy");
        s.add("vu viet duy");
        s.add("vu viet");

        for (String x : s) {
            System.out.println(x);
        }
    }
}