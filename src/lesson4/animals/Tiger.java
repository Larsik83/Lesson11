package lesson4.animals;

public class Tiger extends Animal{

    public void swiming(){
        System.out.println("тигр плавает");
    }
    public void laz(){
        System.out.println("Лазиет тигр");
    }


    @Override
    public void voice() {
        System.out.println("тигр рррррррррррр");
    }

    @Override
    public String toString() {
        return "тигр: имя - "+this.getName()+" вес : "+this.getWeight()+" цена : "+this.getCena();
    }
}
