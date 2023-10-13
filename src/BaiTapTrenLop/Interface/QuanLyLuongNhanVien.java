package BaiTapTrenLop.Interface;

public class QuanLyLuongNhanVien {
    public static void main(String[] args) {

    }
}

abstract class StaffMember {
    protected String name, address, phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public abstract double pay();
}

class Volunteer extends StaffMember{

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {
        return 0;
    }
}

class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", payRate=" + payRate +
                '}';
    }

    @Override
    public double pay() {
        return 0;
    }
}

class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone) {
        super(name, address, phone);
    }
}

class Hourly extends Employee {
    private int hoursWorked;
    public Hourly(String name, String address, String phone) {
        super(name, address, phone);
    }
}


