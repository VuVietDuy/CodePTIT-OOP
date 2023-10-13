public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {

    }
}

class Staff {
    private final String id = "NV01";
    private String name;
    private long basicSalary;
    private int workdays;
    private String position;

    public Staff(String name, long basicSalary, int workdays, String position) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.workdays = workdays;
        this.position = position;
    }

    public Long getSalary () {
        return workdays*basicSalary;
    }

//    public Long reward () {
//
//    }

    @Override
    public String toString() {
        return id + " " + name + " ";
    }
}
