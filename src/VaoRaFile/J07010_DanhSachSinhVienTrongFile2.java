package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\PTIT\\OOP-PTIT\\CodePTIT\\src\\VaoRaFile\\DATA.in"));
        int n = sc.nextInt();
        ArrayList<Student> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String ten = sc.nextLine(), lop = sc.next(), ns = sc.next();
            float gpa = sc.nextFloat();
            Student s = new Student(ten,lop,ns,gpa);
            a.add(s);
        }
        for (Student s : a) {
            System.out.println(s);
        }
    }
}

class Student{
    private static int stt = 0;
    private String id;
    private String name;
    private String _class;
    private String birth;
    private float gpa;

    public Student( String name, String _class, String birth, float gpa) {
        stt ++;
        this.setId(stt);
        this.name = name;
        this._class = _class;
        this.birth = birth;
        this.gpa = gpa;
    }

    public void setId(int stt) {
        if (stt < 10) {
            this.id = "B20DCCN00" + String.valueOf(stt);
        } else {
            this.id = "B20DCCN0" + String.valueOf(stt);
        }
    }

    public StringBuilder setBirth(String s) {
        StringBuilder res = new StringBuilder(s);
        if (res.charAt(2) != '/') {
            res.insert(0, '0');
        }
        if (res.charAt(5) != '/') {
            res.insert(3, '0');
        }
        return res;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + _class + " " + birth + " " + gpa;
    }
}
