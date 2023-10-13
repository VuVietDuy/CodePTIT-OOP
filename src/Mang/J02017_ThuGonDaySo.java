package Mang;

import java.util.ArrayList;
import java.util.Scanner;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> st = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (!st.isEmpty()) {
                int b = st.get(st.size()-1);
                if ((a+b) % 2 == 0) {
                    st.remove(st.size()-1);
                } else {
                    st.add(a);
                }
            } else {
                st.add(a);
            }
        }
        System.out.println(st.size());
    }
}
