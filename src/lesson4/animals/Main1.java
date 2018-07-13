package lesson4.animals;

public class Main1 {
    public static void main(String[] args) {
        Tiger tigr1=new Tiger();
        tigr1.setName("Вася");
        tigr1.setCena(400);
        tigr1.setWeight(100);
        Slon slon1=new Slon();
        Monkey monkey1=new Monkey();

        slon1.setCena(100);
        slon1.setName("Петя");
        slon1.setLenght(50);

        monkey1.setCena(70);
        monkey1.setName("Маша");
        monkey1.setWeight(25);

        Zoopark zoo1=new Zoopark("Centralniy");
        zoo1.buyAnimal(tigr1);
        zoo1.buyAnimal(monkey1);
        zoo1.buyAnimal(slon1);
        zoo1.stoimostZverey();
        zoo1.samiyDesheviy();
        zoo1.menee500();



    }
}
