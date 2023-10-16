package XauKyTu;

import java.util.ArrayList;
import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> v = new ArrayList<>();
        while (n-- != 0) {
            String name = sc.nextLine();
            name.trim();
            String[] words = name.split("\\s+");
            String email = words[words.length-1];
            for (int i = 0; i < words.length-1; i++) {
                email += words[i].substring(0,1).toLowerCase();
            }
            v.add(email);
        }
        for (String e : v) {
            System.out.println(e);
        }
    }
}

/*
4
    nGUYEn    quaNG   vInH
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
 */
