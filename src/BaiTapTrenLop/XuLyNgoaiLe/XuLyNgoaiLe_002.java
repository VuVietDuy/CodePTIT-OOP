package BaiTapTrenLop.XuLyNgoaiLe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class XuLyNgoaiLe_002 {
    public static void main(String[] args) {
        Student s = checkStudentException();
        System.out.println(s);
    }

    public static Student checkStudentException() {
        Scanner sc = new Scanner(System.in);
        try {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();

            if (id.charAt(0) != 'B') {
                System.out.println("Nhap sai id");
                return null;
            }

            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= '1' && name.charAt(i) <= '9') {
                    System.out.println("Nhap sai ten");
                    return null;
                }
            }

            Student s = new Student(id, name, age);
            return s;
        } catch (InputMismatchException e) {
            System.out.println("Nhap sai tuoi");
            return null;
        }
    }
}

class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
