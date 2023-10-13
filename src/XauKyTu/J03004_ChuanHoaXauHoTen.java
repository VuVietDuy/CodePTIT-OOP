package XauKyTu;

import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        while (cases-- != 0) {
            String s = sc.nextLine();
            s = s.trim();
            String[] words = s.split("\\s+");
            String ans = "";
            for (String word : words) {
                ans += word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            }
            System.out.println(ans);
        }
    }
}
