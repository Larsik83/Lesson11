package lesson6;

import java.util.Comparator;
import java.util.TreeSet;

public class Main6 {
    public static void main(String[] args) {
        TreeSet<String> text1=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        });
        text1.add("Hello");
        text1.add("Winter");
        text1.add("Summer");
        text1.add("Bye");

        for (String currentText:text1){
            System.out.println(currentText);
        }
    }
}
