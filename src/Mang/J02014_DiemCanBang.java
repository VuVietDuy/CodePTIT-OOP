package Mang;

import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int sumLeft = 0;
            int ans = -1;
            for (int i = 2; i <= n; i++) {
                sumLeft += a[i-1];
                if (sumLeft == (sum - sumLeft - a[i])) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
