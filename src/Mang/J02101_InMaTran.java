package Mang;

import java.util.Scanner;

public class J02101_InMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    for (int j = n-1; j >= 0; j--) {
                        System.out.print(a[i][j] + " ");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

/*
2
3
45 48 54 21 89 87 70 78 15
2
25 27 23 21

 */
