package Mang;

import java.util.Scanner;

public class J02022_SoXaCach {
    static int[] a = new int[100], visited = new int[100];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            int n = sc.nextInt();
            Try(n, 1);
            System.out.println();
        }
    }

    public static void Try(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (visited[j] == 0) {
                a[i] = j;
                visited[j] = 1;
                if (i == n && check(n)) {
                    for (int k = 1; k <= n; k++) {
                        System.out.print(a[k]);
                    }
                    System.out.println();
                } else {
                    Try(n, i+1);
                }
                visited[j] = 0;
            }
        }
    }

    public static boolean check(int n) {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i+1]) == 1) {
                return false;
            }
        }
        return true;
    }
}
