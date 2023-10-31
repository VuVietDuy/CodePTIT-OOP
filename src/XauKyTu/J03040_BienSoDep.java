package XauKyTu;

import java.util.Scanner;

public class J03040_BienSoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.next();
            String temp = s.substring(5, 8) + s.substring(9,11);
            if (solve1(temp) || solve2(temp) || solve3(temp) || solve4(temp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean solve1 (String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= s.charAt(i-1)) return false;
        }
        return true;
    }

    public static boolean solve2 (String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) return false;
        }
        return true;
    }

    public static boolean solve3 (String s) {
        return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4);
    }

    public static boolean solve4 (String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
}

/*
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88
 */