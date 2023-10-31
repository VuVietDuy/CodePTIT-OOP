package BaiTapTrenLop.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.SQLOutput;

public class GUI_006 {
    public static void main(String[] args) {
        MouseView mouseView = new MouseView();
    }
}

class MouseController implements MouseListener, MouseMotionListener {

    private MouseView mouseView;

    public MouseController(MouseView mouseView) {
        this.mouseView = mouseView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseView.checkIn();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseView.checkOut();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseView.updatePos(x, y);
    }
}

class MouseView extends JFrame {
    private MouseModel model;
    private JPanel jPanel_mouse;
    private JLabel jLabel_position;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_countValue;
    private JLabel jLabel_checkIn;
    private JLabel jLabel_checkInValue;

    public MouseView() throws HeadlessException {
        this.model = new MouseModel();
        this.init();
    }

    public void init() {
        this.setTitle("Mouse Ex");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MouseController mouseController = new MouseController(this);
        jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.cyan);
        jPanel_mouse.addMouseListener(mouseController);
        jPanel_mouse.addMouseMotionListener(mouseController);

        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3,3));

        jLabel_position = new JLabel("Position: ");
        jLabel_x = new JLabel("x: ");
        jLabel_y = new JLabel("y: ");
        jLabel_count = new JLabel("Numbers of clicks: ");
        jLabel_countValue = new JLabel("0");
        jLabel_checkIn = new JLabel("Mouse is in component: ");
        jLabel_checkInValue = new JLabel("No");
        JLabel jLabel_empty1 = new JLabel();
        JLabel jLabel_empty2 = new JLabel();

        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_countValue);
        jPanel_info.add(jLabel_empty1);
        jPanel_info.add(jLabel_checkIn);
        jPanel_info.add(jLabel_checkInValue);
        jPanel_info.add(jLabel_empty2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse, BorderLayout.CENTER);
        this.add(jPanel_info, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void click() {
        this.model.click();
        this.jLabel_countValue.setText(String.valueOf(model.getCount()));
    }

    public void checkIn() {
        this.model.setCheckIn("Yes");
        this.jLabel_checkInValue.setText(this.model.getCheckIn());
    }

    public void checkOut() {
        this.model.setCheckIn("No");
        this.jLabel_checkInValue.setText(this.model.getCheckIn());
    }

    public void updatePos(int x, int y) {
        this.model.setX(x);
        this.model.setY(y);
        this.jLabel_x.setText("x: " + this.model.getX());
        this.jLabel_y.setText("y: " + this.model.getY());
    }

}

class MouseModel {
    private int x, y;
    private int count;
    private String checkIn;

    public MouseModel() {
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkIn = "no";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void click() {
        this.count++;
    }
}
