package lesson5;

public class Magazin {
    private Telefon[] telefons = new Telefon[10];

    public void samiyDesheviy() {
        int min = -1;
        for (int i = 0; i < telefons.length; i++) {
            if (telefons[i] != null) {
                if (min == -1) {
                    min = telefons[i].getPrice();
                }
                if (telefons[i].getPrice() < min) {
                    min = telefons[i].getPrice();
                }
            }
        }
        System.out.println(min);
    }

    public void addTelefon(Telefon telefon) {
        for (int i = 0; i < telefons.length; i++) {
            if (telefons[i] == null) {
                telefons[i] = telefon;
                break;
            }

        }

    }
}
