package KhaiBaoLopVaDoiTuong;

import java.math.BigInteger;
import java.util.Scanner;

public class J04014_TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            PhanSo p1 = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo p2 = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo c = p1.cong(p2).nhan(p1.cong(p2));
            PhanSo d = p1.nhan(p2).nhan(c);
            System.out.println(c + " " + d);
        }
    }
}

class PhanSo {
    long tu, mau;
    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo cong(PhanSo p) {
        PhanSo k = new PhanSo();
        k.tu = this.tu * p.mau + this.mau * p.tu;
        k.mau = this.mau * p.mau;
        return rutGon(k);
    }

    public PhanSo nhan(PhanSo p) {
        PhanSo k = new PhanSo();
        k.tu = this.tu * p.tu;
        k.mau = this.mau * p.mau;
        return rutGon(k);
    }

    public PhanSo rutGon(PhanSo p) {
        PhanSo k = new PhanSo();
        BigInteger t = BigInteger.valueOf(p.tu).gcd(BigInteger.valueOf(p.mau));
        k.tu = p.tu / t.longValue();
        k.mau = p.mau / t.longValue();
        return k;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
