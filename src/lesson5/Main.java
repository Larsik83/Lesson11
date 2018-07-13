package lesson5;

public class Main {
    public static void main(String[] args) {
        Magazin mag1=new Magazin();
        Samsung j500=new Samsung(550);
        Samsung j700=new Samsung(800);
        Apple s4=new Apple(1000);
        mag1.addTelefon(j500);
        mag1.addTelefon(j700);
        mag1.addTelefon(s4);

        mag1.samiyDesheviy();



    }
}
