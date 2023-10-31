package BaiTapTrenLop.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_004 {
    public static void main(String[] args) {
        LastBtnView lastBtnView = new LastBtnView();
    }
}


// controller
class LastBtnController implements ActionListener {
    private LastBtnView lastBtnView;

    public LastBtnController(LastBtnView lastBtnView) {
        this.lastBtnView = lastBtnView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println(src);
        this.lastBtnView.changTo(src);
    }
}

// view
class LastBtnView extends JFrame {
    private LastBtn lastBtn;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel;

    public LastBtnView() {
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Last Btn");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 20);

        ActionListener ac = new LastBtnController(this);

        jButton1 = new JButton("1");
        jButton2 = new JButton("2");
        jButton3 = new JButton("3");
        jButton4 = new JButton("4");
        jButton1.setFont(font);
        jButton2.setFont(font);
        jButton3.setFont(font);
        jButton4.setFont(font);

        jButton1.addActionListener(ac);
        jButton2.addActionListener(ac);
        jButton3.addActionListener(ac);
        jButton4.addActionListener(ac);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,2));


        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        JPanel jPanel1 = new JPanel();
        jLabel = new JLabel("---");
        jLabel.setFont(font);
        jPanel1.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
        this.add(jPanel1, BorderLayout.SOUTH);
    }

    public void changTo(String s) {
        this.jLabel.setText("Last btn : " + s);
    }
}


// model
class LastBtn {
    private int value;

    public LastBtn(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


