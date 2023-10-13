package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", i);
            for (int j = 2; j <= n; j++) {
                int count = 0;
                while (n % j == 0 ) {
                    count ++;
                    n /= j;
                }
                if (count > 0)
                    System.out.printf("%d(%d) ", j, count);
            }
            System.out.println();
        }
    }
}
