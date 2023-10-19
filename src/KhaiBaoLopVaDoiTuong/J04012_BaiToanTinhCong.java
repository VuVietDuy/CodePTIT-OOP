package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long s = sc.nextLong();
        int w = sc.nextInt();
        String p = sc.next();
        Staff staff = new Staff(n, s,w,p);
        System.out.println(staff);
    }
}

class Staff {
    private final String id = "NV01";
    private String name;
    private long basicSalary;
    private int workdays;
    private String position;

    public Staff(String name, long basicSalary, int workdays, String position) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.workdays = workdays;
        this.position = position;
    }

    public long getSalary () {
        return workdays*basicSalary;
    }

    public long getReward () {
        int phanTram = 0;
        if (workdays >= 25) {
            phanTram = 20;
        } else if (workdays >= 20) {
            phanTram = 10;
        }
        return getSalary() * phanTram / 100;
    }

    public long getAllowance () {
        if (position.equals("GD")) {
            return 250000;
        } else if (position.equals("PGD")) {
            return 200000;
        } else if (position.equals("TP")) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public long getIncome() {
        return getAllowance() + getReward() + getSalary();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getSalary() + " " + getReward() + " " + getAllowance() + " " + getIncome();
    }
}
/*
Bui Thi Trang
45000
23
PGD
 */