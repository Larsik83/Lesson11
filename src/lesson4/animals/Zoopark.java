package lesson4.animals;

public class Zoopark {
    private String name;
    private Animal[] kletki = new Animal[10];



    public Zoopark() {

    }

    public Zoopark(String name) {
        this.name = name;
    }

    public void buyAnimal(Animal animal) {
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] == null) {
                kletki[i] = animal;
                break;

            }
        }
    }

    public void printAnimalName() {
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] != null) {
                Animal animal = kletki[i];

                System.out.println(animal.getName());

            }
        }

    }

    public void printAnimalVoice() {
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] != null) {
                Animal animal = kletki[i];
                animal.voice();
            }
        }
    }

    public void printAllInfo() {
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] != null) {
                System.out.println(kletki[i].toString());
            }
        }


    }

    public void stoimostZverey() {
        int count = 0;
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] != null) {
                count = count + kletki[i].getCena();
            }

        }
        System.out.println("Стоимость всех зверей: " + count);
    }

    public void samiyDesheviy() {
        int min = -1;
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] != null) {
                if (min == -1){
                    min = kletki[i].getCena();
                }
                if (kletki[i].getCena()<min ) {
                    min=kletki[i].getCena();
                }

            }
        }
        for (int i=0;i<kletki.length;i++){
            if (kletki[i]!=null) {
                if (kletki[i].getCena()==min) {
                    System.out.println("самый дешевый: "+kletki[i]);
                }
            }
        }



    }

    public void menee500() {
        for (int i = 0; i < kletki.length; i++) {
            if (kletki[i] != null) {
                if (kletki[i].getCena() < 500){
                    System.out.println("менее 500: " + kletki[i]);
                }
            }
        }
    }


}

// 1. посчитать общую стоимость зверей и вывести на консоль
//2. вывести самого дешевого зверя
//3. вывести на консоль зверей стоимостью меньше 500 .

