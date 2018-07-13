package lesson7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet <Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(8);
        tree.add(15);
        tree.add(2);
        ArrayList<Integer> qq= new ArrayList<>();
        ArrayList<Integer> qq2=new ArrayList<>();



            for (Integer currentNum:tree){
            System.out.println(currentNum);
        }
    }
}
