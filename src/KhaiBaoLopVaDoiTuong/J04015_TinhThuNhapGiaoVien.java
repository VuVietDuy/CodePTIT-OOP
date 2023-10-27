package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        sc.nextLine();
        String name = sc.nextLine();
        long s = sc.nextLong();
        Teacher t = new Teacher(id, name, s);
        System.out.println(t);
    }
}

class Teacher {
    private String id;
    private String name;
    private Long basicSalary;

    public Teacher(String id, String name, Long basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }


    public int getLever() {
        return Integer.parseInt(this.id.substring(2));
    }

    public long getAllowance() {
        String chucVu = id.substring(0,2);
        if (chucVu.equals("HT")) {
            return 2000000;
        } else if (chucVu.equals("HP")) {
            return 900000;
        } else {
            return 500000;
        }
    }

    public long getSalary() {
        return (long) getLever() * basicSalary + getAllowance();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getLever() + " " + getAllowance() + " " +  getSalary();
    }
}

/*
HP04
Tran Quoc Huy
1578000
 */