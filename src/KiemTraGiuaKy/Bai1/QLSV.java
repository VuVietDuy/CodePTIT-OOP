package KiemTraGiuaKy.Bai1;

import java.util.Scanner;

public class QLSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Stt " + (i+1));
            System.out.print("Họ và tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            System.out.print("Id: ");
            String id = sc.next();
            students[i] = new Student(name, age, id);
            sc.nextLine();
        }
        while (true) {
            System.out.print(
                    "1. Nhập n để tìm theo tên \n" +
                            "2. Nhập t để tìm theo tuổi \n" +
                            "3. Nhập i để tìm theo id \n" +
                            "4. Nhập p để xem toàn bộ danh sách \n" +
                            "5. Nhập e để thoát khỏi chương trình \n"
            );
            String c = sc.next();
            switch (c) {
                case "n":
                    System.out.print("Nhập tên: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    searchByName(students, n, name);
                    break;
                case "t":
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    searchByAge(students, n, age);
                    break;
                case "i":
                    System.out.print("Nhập id: ");
                    String id = sc.next();
                    searchById(students, n, id);
                    break;
                case "p":
                    print(students, n);
                    break;
                case "e":
                    return;
                default:
                    break;
            }
        }
    }

    public static void print(Student[] s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].toString());
        }
    }

    public static void searchByName(Student[] s, int n, String name) {
        for (int i = 0; i < n; i++) {
            s[i].searchName(name);
        }
    }

    public static void searchByAge(Student[] s, int n, int age) {
        for (int i = 0; i < n; i++) {
            s[i].searchAge(age);
        }
    }

    public static void searchById(Student[] s, int n, String id) {
        for (int i = 0; i < n; i++) {
            s[i].searchId(id);
        }
    }

}



class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ten: " + name + " - Tuổi: " + age + " - Id: " + id;
    }

    public void searchName(String n) {
        if (this.name.equals(n)) {
            System.out.println(this.toString());
        }
    }

    public void searchAge(int age) {
        if (this.age == age) {
            System.out.println(this.toString());
        }
    }

    public void searchId(String id) {
        if (this.id.equals(id)) {
            System.out.println(this.toString());
        }
    }
}
