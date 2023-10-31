package BaiTapTrenLop.LapTrinhDaLuong;

import java.awt.*;
import java.util.Scanner;

public class J001 {
    public static void main(String[] args) {
        frame f = new frame();
        Graphics g;
    }
}

class commonNum {
    int x;
}

class frame extends Frame{
    frame() {
        this.setVisible(true);
        this.setSize(400, 400);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(10, 10, 10 ,10);
    }
}

class subThread extends Thread {
    commonNum cn;
    frame f;
    subThread(commonNum cn) {
        this.cn = cn;
    }

    public void run() {
        cn.x += 1;

    }
}

