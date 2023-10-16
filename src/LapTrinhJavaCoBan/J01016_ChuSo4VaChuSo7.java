package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int sum4 = 0, sum7 = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '4') {
                sum4++;
            } else if (num.charAt(i) == '7') {
                sum7++;
            }
        }
        if (sum4+sum7 == 4 || sum4+sum7 == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
