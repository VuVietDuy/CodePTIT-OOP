package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01010_CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- != 0) {
            String s = sc.next();
            System.out.println(CatDoi(s));
        }

    }

    public static String CatDoi(String s) {
        boolean ok = false;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                if (ok) {
                    ans += '0';
                }
            } else if (s.charAt(i) == '1') {
                ok = true;
                ans += '1';
            } else {
                return "INVALID";
            }
        }
        if (ans.isEmpty()) return "INVALID";
        return ans;
    }
}
