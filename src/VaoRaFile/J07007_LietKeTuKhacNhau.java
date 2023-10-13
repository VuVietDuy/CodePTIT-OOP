package VaoRaFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("D:\\PTIT\\OOP-PTIT\\CodePTIT\\src\\VaoRaFile\\DATA.in");
        System.out.println(ws);
        ws.tachTu();
    }
}

class WordSet {
    private Scanner sc;
    private Set<String> st;
    WordSet(String path) throws IOException {
        File f = new File(path);
        sc = new Scanner(f);
    }

    public void tachTu () {
        st = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            st.add(s);
        }
    }

    @Override
    public String toString() {
        tachTu();
        StringBuffer s = new StringBuffer("");
        for (String x : st) {
            s.append("\n").append(x);
        }
        return s.toString();
    }

}
