package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            BigInteger n1 = sc.nextBigInteger();
            BigInteger n2 = sc.nextBigInteger();
            System.out.println(n1.gcd(n2));
        }
    }
}
