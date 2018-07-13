package lesson4;

public class Drobnoe {
    private int chislit;
    private int znamenat;

    public Drobnoe () {

    }

    public Drobnoe(int chislit,int b){
        this.chislit=chislit;
        znamenat=b;

    }

    public int getZnamenat() {
        return znamenat;
    }

    public int getChislit() {
        return chislit;
    }
    public void printConsole (){
        System.out.println(this.chislit+"/"+this.znamenat);
    }

}
