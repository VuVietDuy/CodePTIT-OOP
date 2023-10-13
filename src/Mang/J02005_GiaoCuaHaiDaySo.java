package Mang;

import java.util.Scanner;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int dd[] = new int[1001];
        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();
            dd[x] = 1;
        }

        for(int i=0; i<m; i++)
        {
            int x = sc.nextInt();
            if(dd[x] == 1) dd[x] = 2;
        }
        for(int i=0; i<=1000; i++)
        {
            if(dd[i] == 2) System.out.print(i+" ");
        }
    }
}
