package XauKyTu;

import java.util.Scanner;

public class J03008_SoDep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        while (cases-- != 0) {
            String num = sc.next();
            if (soDep2(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean soDep2(String num) {
        int l = 0, r = num.length()-1;
        String snt = "2357";
        while (l <= r) {
            char c = num.charAt(l);
            if (c != num.charAt(r)) return false;
            if (c != '2' && c != '3' && c != '5' && c != '7') return false;
            l++; r--;
        }
        return true;
    }
}
