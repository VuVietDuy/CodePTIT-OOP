package BaiTapTrenLop.GUI;

import javax.swing.*;
import java.awt.*;

public class GUI_001 {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends JFrame {
    public Calculator() {

        this.setSize(300, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField jTextField = new JTextField();
        JButton jButton_0 = new JButton("0");
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("x");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");

        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);

        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(5, 3));


        jPanel_button.add(jButton_0);
        jPanel_button.add(jButton_1);
        jPanel_button.add(jButton_2);
        jPanel_button.add(jButton_3);
        jPanel_button.add(jButton_4);
        jPanel_button.add(jButton_5);
        jPanel_button.add(jButton_6);
        jPanel_button.add(jButton_7);
        jPanel_button.add(jButton_8);
        jPanel_button.add(jButton_9);
        jPanel_button.add(jButton_cong);
        jPanel_button.add(jButton_tru);
        jPanel_button.add(jButton_nhan);
        jPanel_button.add(jButton_chia);
        jPanel_button.add(jButton_bang);

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_button, BorderLayout.CENTER);

        this.setVisible(true);
    }
}