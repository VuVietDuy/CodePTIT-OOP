package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01011_BoiSoChung_UocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.print(bcln(a, b) + " " + ucln(a, b) + "\n");
        }
    }

    public static int ucln(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static Long bcln(int a, int b) {
        int ucln = ucln(a, b);
        return (long) a * b / ucln;
    }
}
