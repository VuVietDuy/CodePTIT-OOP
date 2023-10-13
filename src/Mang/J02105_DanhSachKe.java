package Mang;

import java.util.Scanner;

public class J02105_DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("List(%d) = ", i);
            for (int j = 1; j <= n; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
/*
6
0 1 1 0 1 0
1 0 1 0 1 0
1 1 0 1 0 0
0 0 1 0 1 1
1 1 0 1 0 1
0 0 0 1 1 0
 */
