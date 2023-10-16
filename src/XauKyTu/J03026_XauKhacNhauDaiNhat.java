package XauKyTu;

import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            if (s1.equals(s2)) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(s1.length(), s2.length()));
            }
        }
    }
}
