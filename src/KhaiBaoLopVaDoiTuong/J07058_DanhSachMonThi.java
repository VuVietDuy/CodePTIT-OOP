package KhaiBaoLopVaDoiTuong;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        String n = sc.nextLine();
        ArrayList<Subject> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            Subject s = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(s);
        }
        Collections.sort(list);
        for (Subject subject : list) {
            System.out.println(subject);
        }
    }
}

class Subject implements Comparable<Subject> {
    private String subjectCode;
    private String name;
    private String testFormat;

    public Subject(String subjectCode, String name, String testFormat) {
        this.subjectCode = subjectCode;
        this.name = name;
        this.testFormat = testFormat;
    }

    @Override
    public int compareTo(Subject o) {
        return this.subjectCode.compareTo(o.subjectCode);
    }

    @Override
    public String toString() {
        return subjectCode + " " + name + " " + testFormat;
    }
}
