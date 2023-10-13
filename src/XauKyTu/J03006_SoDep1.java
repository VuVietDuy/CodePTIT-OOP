package XauKyTu;

import java.util.Scanner;

public class J03006_SoDep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        while (cases-- != 0) {
            String num = sc.next();
            if (soDep(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean soDep(String num) {
        int l = 0, r = num.length()-1;
        while (l <= r) {
            if (num.charAt(l) != num.charAt(r)) return false;
            if ((num.charAt(l)-'0') % 2 == 1) return false;
            l++; r--;
        }
        return true;
    }
}
