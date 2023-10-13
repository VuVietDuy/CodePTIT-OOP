package Mang;

import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int idx = 0;
        boolean excellent = true;
        for (int i = 1; i < a[n-1]; i++) {
            if (a[idx] > i) {
                System.out.println(i);
                excellent = false;
            } else {
                idx++;
            }
        }
        if (excellent) {
            System.out.println("Excellent!");
        }
    }
}
