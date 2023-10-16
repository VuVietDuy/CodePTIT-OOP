package VaoRaFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (name.equals("END")) {
                break;
            }
            System.out.println(chuanHoaHoTen(name));
        }
    }

    public static String chuanHoaHoTen(String name) {
        String[] n = name.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String word : n) {
            res.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return res.toString();
    }
}
