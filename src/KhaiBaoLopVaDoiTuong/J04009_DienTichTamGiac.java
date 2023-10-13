package KhaiBaoLopVaDoiTuong;

public class J04009_DienTichTamGiac {
    public static void main(String[] args) {

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
        return 0;
    }
}
