package lesson6;

import java.util.Objects;

public class Moneta implements Comparable<Moneta>{
    private  int kolvoStars;
    private  int godVipuska;
    private  double diametr;

    public Moneta() {

    }
    public Moneta(int kolvoStars,int godVipuska,double diametr){
        this.kolvoStars=kolvoStars;
        this.godVipuska=godVipuska;
        this.diametr=diametr;
    }

    public int getGodVipuska(){
        return godVipuska;
    }

    public int getKolvoStars(){
        return kolvoStars;
    }
    public double getDiametr(){
        return diametr;
    }

    @Override
    public String toString() {
        return "Монета звезд :"+ kolvoStars+" "+"год выпуска: "+godVipuska+"диаметр :"+diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneta moneta = (Moneta) o;
        return kolvoStars == moneta.kolvoStars &&
                godVipuska == moneta.godVipuska &&
                Double.compare(moneta.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(kolvoStars, godVipuska, diametr);
    }

    @Override
    public int compareTo(Moneta o) {
        Integer god1=this.godVipuska;
        Integer god2=o.godVipuska;
        Integer zvezd1=this.kolvoStars;
        Integer zvezd2=o.kolvoStars;
        Double diam1=this.diametr;
        Double diam2=o.diametr;

        if (!god1.equals(god2)){
            return god1.compareTo(god2);
        }
        if (!zvezd1.equals(zvezd2)){
            return zvezd1.compareTo(zvezd2);
        }

        return diam1.compareTo(diam2);

    }
}
