package XauKyTu;

import java.util.Scanner;

public class J03007_SoDep2 {
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
        if (num.charAt(l) != '8') return false;
        int sum = 0;
        while (l <= r) {
            if (num.charAt(l) != num.charAt(r)) return false;
            sum += (int)(num.charAt(l)-'0');
            l++; r--;
        }
        return (sum % 10 == 0);
    }
}
/*
4
123456787654321
8644281154664511824468
8006000444400000000000044440006008
82123400000000000000000000000432128
 */