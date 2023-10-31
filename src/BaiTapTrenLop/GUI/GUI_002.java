package BaiTapTrenLop.GUI;

import javax.swing.*;

public class GUI_002 extends JFrame{
    public GUI_002() {

    }

    public void showUI() {
        this.setVisible(true);
    }

    public void showUI(String title) {
        this.setTitle(title);
        this.setSize(400, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GUI_002 g = new GUI_002();
        g.showUI("window");
    }

}

