package lesson4.animals;

public abstract class Animal {
    private int cena;
    private int weight;
    private String name;

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCena() {
        return cena;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println(" животное бегает");
    }

    public abstract void voice();
}
