package lesson4;

public class DrobMethods {

    public Drobnoe summa (Drobnoe dr1,Drobnoe dr2){
        int obZnamen= dr1.getZnamenat()*dr2.getZnamenat();
        int obChisl=(dr1.getChislit()*dr2.getZnamenat())+(dr2.getChislit()*dr1.getZnamenat());
        Drobnoe resultat= new Drobnoe(obChisl,obZnamen);
        return resultat;
    }
}
// доделать минус умножить делить..
