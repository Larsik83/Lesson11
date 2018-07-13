package lesson6;

import java.util.Comparator;

public class SortByDiagonalComparator implements Comparator<Moneta> {

    @Override
    public int compare(Moneta o1, Moneta o2) {
        Integer god1=o1.getGodVipuska();
        Integer god2=o2.getGodVipuska();
        Integer zvezd1=o1.getKolvoStars();
        Integer zvezd2=o2.getKolvoStars();
        Double diam1=o1.getDiametr();
        Double diam2=o2.getDiametr();

        if (!diam1.equals(diam2)){
            return diam1.compareTo(diam2);
        }
        if (!god1.equals(god2)){
            return god1.compareTo(god2);
        }

        return zvezd1.compareTo(zvezd2);
    }
}
