package Mang;

import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int t = 1;
        while (cases-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            int cnt[] = new int[(int) 10e5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            System.out.printf("Test %d: \n", t);
            t++;
            for (int i = 0; i < n; i++) {
                if (cnt[a[i]] != 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], cnt[a[i]]);
                    cnt[a[i]] = 0;
                }
            }
        }
    }
}

/*
1
10
1 7 2 8 3 3 2 1 3 2

 */