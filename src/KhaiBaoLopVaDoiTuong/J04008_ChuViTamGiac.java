package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            Point1 p1 = new Point1(sc.nextDouble(), sc.nextDouble());
            Point1 p2 = new Point1(sc.nextDouble(), sc.nextDouble());
            Point1 p3 = new Point1(sc.nextDouble(), sc.nextDouble());

            double ab = p1.distance(p2);
            double ac = p2.distance(p3);
            double bc = p1.distance(p3);

            if (checkRec(ab, bc, ac)) {
                double p = ab + ac + bc;
                System.out.printf("%.3f\n", p);
            } else {
                System.out.println("INVALID");
            }
        }
    }

    public static boolean checkRec(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

class Point1 {
    private double x, y;

    public Point1() {
    }

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point1(Point1 p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point1 p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0

 */