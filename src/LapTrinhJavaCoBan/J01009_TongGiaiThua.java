package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long t = 1;
        for (int i = 1; i <= n; i++) {
            t *= i;
            ans += t;
        }
        System.out.println(ans);
    }
}
