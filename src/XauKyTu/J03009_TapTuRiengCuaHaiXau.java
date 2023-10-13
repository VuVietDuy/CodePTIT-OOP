package XauKyTu;

<<<<<<< HEAD
import java.util.Scanner;
=======
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
>>>>>>> e56fdd4327937a9004896944ac481eb93803dd01

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- != 0) {
            String s1 = sc.nextLine();
            String[] words = s1.split("\\s");
            for (String word :
                    words) {
                System.out.println(word);
            }
        }
    }
}

/*
* TreeSet là một phần của java collection framework
* */
=======
        int cases = Integer.parseInt(sc.nextLine());
        while (cases-- != 0) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();

            TreeSet<String> tr1 = new TreeSet<>();
            TreeSet<String> tr2 = new TreeSet<>();

            tr1.addAll(Arrays.asList(s1.split("\\s+")));
            tr2.addAll(Arrays.asList(s2.split("\\s+")));

            for (String x : tr1) {
                if (!tr2.contains(x)) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}
>>>>>>> e56fdd4327937a9004896944ac481eb93803dd01
