package KhaiBaoLopVaDoiTuong;

import java.text.DecimalFormat;
import java.util.Scanner;

public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next(); sc.nextLine();
        String n = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        ThiSinh thiSinh = new ThiSinh(m, n, a, b, c);
        System.out.println(thiSinh);
    }
}

class ThiSinh {
    private String mtt, hoTen, mod;
    private double diemToan, diemLy, diemHoa, tongDiem, diemUuTien;

    public ThiSinh(String mtt, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.mtt = mtt;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        String khuVuc = mtt.substring(0,3);
        if (khuVuc.equals("KV3")) {
            diemUuTien = 2.5;
        } else if (khuVuc.equals("KV2")) {
            diemUuTien = 1;
        } else {
            diemUuTien = 0.5;
        }
        tongDiem = diemToan * 2 + diemLy + diemHoa;
        mod = tongDiem + diemUuTien >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }

    @Override
    public String toString() {
        return mtt + " " + hoTen + " " + (new DecimalFormat().format(diemUuTien)) + " " +  (new DecimalFormat().format(tongDiem))  + " " + mod;
    }
}

/*
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
 */
