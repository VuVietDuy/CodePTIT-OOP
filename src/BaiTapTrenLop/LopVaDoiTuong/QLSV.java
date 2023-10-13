package BaiTapTrenLop.LopVaDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> s = new ArrayList<>();
        while (true) {
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    Student student = new Student(sc.nextLine(), sc.nextLine(), sc.next(), sc.nextFloat());
                    s.add(student);
                case 2:
                    for (Student x :
                            s) {
                        x.displaySinhVien();
                    }
                case 3:
                    System.out.println("ok");
                case 5:
                    return;
            }
        }
    }
}

class Student {
    private String maSv, hoTen, gioiTinh;
    private float gpa;

    public Student(String maSv, String hoTen, String gioiTinh, float gpa) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String displaySinhVien() {
        return maSv + " " +
                hoTen + " " +
                gioiTinh + " " +
                gpa;
    }
}
