package lesson4.animals;

public class Slon extends Animal{
    private int lenght;


    public void setLenght(int lenght){
        this.lenght=lenght;
    }
    public int getLenght(){
        return lenght;
    }
    public void Swiming(){
        System.out.println("Слон плавает");
    }

    @Override
    public void voice() {
        System.out.println("Слон дудуду");
    }
    @Override
    public String toString() {
        return "слон: имя - "+this.getName()+" вес : "+this.getWeight()+" цена : "+this.getCena()+"длина хобота "+this.lenght;
    }
}
