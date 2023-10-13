package KiemTraGiuaKy.Bai3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        checkThreeDivision(n);
    }

    public static void checkThreeDivision(int n) {
        if (n % 3 != 0) {
            throw new Check("ThreeDivision");
        }
    }
}

class Check extends RuntimeException {
    public Check() {
    }

    public Check(String message) {
        super(message);
    }
}


