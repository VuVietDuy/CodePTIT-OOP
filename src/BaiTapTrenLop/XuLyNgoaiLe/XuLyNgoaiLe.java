package BaiTapTrenLop.XuLyNgoaiLe;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Lan truyền lỗi
* Phương thức Y() gọi một phương thức X()
*
*
*/
public class XuLyNgoaiLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double ans = (double) a / b;
            System.out.println(ans);
        } catch (InputMismatchException e) {
            System.out.println("error");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Final");
        }
    }
}
