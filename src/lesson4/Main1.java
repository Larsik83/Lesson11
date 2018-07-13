package lesson4;

public class Main1 {
    public static void main(String[] args) {
        Drobnoe dr1= new Drobnoe(3,4);
        Drobnoe dr2= new Drobnoe(7,5);

        DrobMethods metods= new DrobMethods();
        Drobnoe result= metods.summa(dr1,dr2);
        result.printConsole();

    }
}
