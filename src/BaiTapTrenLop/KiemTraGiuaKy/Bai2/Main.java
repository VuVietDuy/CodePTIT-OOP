package BaiTapTrenLop.KiemTraGiuaKy.Bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ve hinh");
        JButton jb1 = new JButton("Triagle");
        JButton jb2 = new JButton("Rectangle");
        JPanel jp1 = new JPanel();
        jp1.setLocation(100 ,100);
        jp1.setSize(500,500);

        jb1.setBounds(50, 50 ,100, 30);
        jb2.setBounds(300,50,100,30);
        frame.add(jb1); frame.add(jb2);
        frame.add(jp1);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = jp1.getGraphics();
                g.clearRect(0,0, 500    , 500);
                g.drawLine(100, 100, 50, 200);
                g.drawLine(50, 200, 150, 200);
                g.drawLine(100, 100, 150, 200);
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = jp1.getGraphics();
                g.clearRect(0,0, 500   , 500);
                g.drawRect(50, 50, 200, 100);

            }
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}