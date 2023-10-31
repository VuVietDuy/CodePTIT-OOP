package BaiTapTrenLop.GUI;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_003 {
    public static void main(String[] args) {
        CounterView counterView = new CounterView();
    }
}

// view
class CounterView extends JFrame {
    private Counter counter;
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton jButton_reset;
    private JLabel jLabel_value;

    public CounterView() {
        this.counter = new Counter();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        jButton_up = new JButton("Up");
        jButton_down = new JButton("Down");
        jButton_reset = new JButton("Reset");
        jLabel_value = new JLabel(this.counter.getValue()+"", JLabel.CENTER);

        this.jButton_up.addActionListener(ac);
        this.jButton_down.addActionListener(ac);
        this.jButton_reset.addActionListener(ac);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jPanel.add(jButton_down, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_up, BorderLayout.EAST);
        jPanel.add(jButton_reset, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jPanel);
    }

    public void increment() {
        this.counter.increment();
        this.jLabel_value.setText(this.counter.getValue()+"");
    }

    public void decrement() {
        this.counter.decrement();
        this.jLabel_value.setText(this.counter.getValue()+"");
    }

    public void reset() {
        this.counter.resetValue();
        this.jLabel_value.setText(this.counter.getValue()+"");
    }
}

// controller

class CounterListener implements ActionListener {
    private CounterView ctv;

    public CounterListener(CounterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Up")) {
            this.ctv.increment();
        } else if (src.equals("Down")) {
            this.ctv.decrement();
        } else if (src.equals("Reset")) {
            this.ctv.reset();
        }
    }
}

// model
class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment() {
        this.value ++;
    }

    public void decrement() {
        this.value --;
    }

    public void resetValue() {
        this.value = 0;
    }
}
