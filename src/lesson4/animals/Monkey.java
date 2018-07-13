package lesson4.animals;

public class Monkey extends Animal{
    public void Lazit(){
        System.out.println("Обезьяна лазиет");
    }


    @Override
    public void voice() {
        System.out.println("Обезьяна кричит оаоа");
    }
    @Override
    public String toString() {
        return "обезьяна: имя - "+this.getName()+" вес : "+this.getWeight()+" цена : "+this.getCena();
    }
}
