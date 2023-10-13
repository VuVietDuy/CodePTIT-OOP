package Mang;

import java.util.Scanner;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= 3; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

/*
3
1 1 0
1 1 1
1 0 0
 */
