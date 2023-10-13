package Mang;

import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            long n = sc.nextLong();
            System.out.println(check(n));
        }
    }

    public static String check(long number) {
        long sum = 0;
        while (number > 9) {
            if (Math.abs(number%10 - (number/10)%10) != 2) {
                return "NO";
            }
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        if (sum % 10 == 0) return "YES";
        else return "NO";
    }
}
