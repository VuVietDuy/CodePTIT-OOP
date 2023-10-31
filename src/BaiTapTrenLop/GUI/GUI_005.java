package BaiTapTrenLop.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI_005 {
    public static void main(String[] args) {
        ListStudentView l = new ListStudentView();
    }
}

// controller
class ListStudentListener implements ActionListener {
    private ListStudentView listStudentView;

    public ListStudentListener(ListStudentView listStudentView) {
        this.listStudentView = listStudentView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Student s = listStudentView.getInputValue();
        listStudentView.writeFile();
        listStudentView.addRow();
        System.out.println(s);
    }
}

// view
class ListStudentView extends JFrame {
    private DefaultTableModel model;
    private JTextField jTextField_name;
    private JTextField jTextField_address;
    private JTextField jTextField_major;
    private List<Student> listStudent;

    public ListStudentView() {
        init();
        this.setVisible(true);
    }

    public void init() {
        this.setSize(600, 400);
        this.setTitle("Student");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.model = new DefaultTableModel();
        model.addColumn("Họ và tên");
        model.addColumn("Địa chỉ");
        model.addColumn("Ngành học");

        listStudent = new ArrayList<>();
        readFile();

        JTable jTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(jTable);

        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);


        // Input
        JLabel jLabel_name = new JLabel("Nhap ho ten: ");
        JLabel jLabel_address = new JLabel("Nhap dia chi: ");
        JLabel jLabel_major = new JLabel("Nhap nganh hoc: ");
        JLabel jLabel_submit = new JLabel("");

        jTextField_name = new JTextField(100);
        jTextField_address = new JTextField(100);
        jTextField_major = new JTextField(100);
        JButton jButton_submit = new JButton("Submit");

        ListStudentListener listStudentListener = new ListStudentListener(this);
        jButton_submit.addActionListener(listStudentListener);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(4, 2));
        jPanelIO.add(jLabel_name);
        jPanelIO.add(jTextField_name);
        jPanelIO.add(jLabel_address);
        jPanelIO.add(jTextField_address);
        jPanelIO.add(jLabel_major);
        jPanelIO.add(jTextField_major);
        jPanelIO.add(jLabel_submit);
        jPanelIO.add(jButton_submit);


        this.add(jPanelIO, BorderLayout.SOUTH);
    }

    public void addRow() {
        Student s = getInputValue();
        model.addRow(new Object[]{s.getName(), s.getAddress(), s.getMajor()});
    }

    public Student getInputValue() {
        return new Student(jTextField_name.getText(), jTextField_address.getText(), jTextField_major.getText());
    }

    public void readFile() {
        try {
            Scanner sc = new Scanner(new File("D:\\PTIT\\OOP-PTIT\\CodePTIT\\src\\BaiTapTrenLop\\GUI\\DATA.in"));
            while (sc.hasNextLine()) {
                Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
                listStudent.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Student s: listStudent) {
            model.addRow(new Object[]{s.getName(), s.getAddress(), s.getMajor()});
        }
    }


    public void writeFile() {
        String fileName = "D:\\PTIT\\OOP-PTIT\\CodePTIT\\src\\BaiTapTrenLop\\GUI\\DATA.in";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            Student student = getInputValue();
            writer.write(student.getName());
            writer.newLine();
            writer.write(student.getAddress());
            writer.newLine();
            writer.write(student.getMajor());
            writer.newLine();

            writer.close();

        } catch (IOException e) {
            System.err.println("Lỗi khi viết vào tệp: " + e.getMessage());
        }
    }
}

// model
class Student {
    private String name;
    private String address;
    private String major;

    public Student() {
    }

    public Student(String name, String address, String major) {
        this.name = name;
        this.address = address;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return name + " " + address + " " + major;
    }
}
