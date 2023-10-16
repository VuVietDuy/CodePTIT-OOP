package XauKyTu;

import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        while (cases-- != 0) {
            String s = sc.next();
            s.toUpperCase();
            char a[] = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (a[i] <= 'C') {
                    a[i] = '2';
                } else if (a[i] <= 'F') {
                    a[i] = '3';
                } else if (a[i] <= 'I') {
                    a[i] = 4;
                } else if (a[i] <= 'L') {
                    a[i] = 5;
                } else if (a[i] <= 'O') {
                    a[i] = 6;
                } else if (a[i] <= 'S') {
                    a[i] = 7;
                } else if (a[i] <= 'V') {
                    a[i] = 8;
                } else if (a[i] <= 'Z') {
                    a[i] = 9;
                }
            }
            if (check(a, s.length())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(char[] c, int n) {
        int l = 0, r = n - 1;
        while (l<=r) {
            if (c[l] != c[r]) return false;
            l++; r--;
        }
        return true;
    }
}
