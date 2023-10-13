package XauKyTu;

import java.util.Scanner;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
