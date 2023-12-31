package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

public class J04009_DienTichTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            double ab = p1.distance(p2);
            double ac = p2.distance(p3);
            double bc = p1.distance(p3);

            if (checkRec(ab, bc, ac)) {
                double p = (ab + ac + bc) / 2;
                double ans = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
                System.out.printf("%.2f\n", ans);
            } else {
                System.out.println("INVALID");
            }
        }
    }

    public static boolean checkRec(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0

 */
