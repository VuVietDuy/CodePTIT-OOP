package XauKyTu;

import java.util.Scanner;
import java.util.TreeSet;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<Character> c = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                c.add(s.charAt(i));
            }
        }
        System.out.println(c.size());
    }
}
