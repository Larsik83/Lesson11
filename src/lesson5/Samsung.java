package lesson5;

public class Samsung implements Telefon{
    private int price;

    public Samsung(){

    }
    public Samsung(int price){
        this.price=price;

    }
    @Override
    public void sendMessage(long tel1, long tel2, String sms) {
        System.out.println("Samsung отправим сообщение "+sms+"от "+ tel1+" "+tel2);
    }

    @Override
    public void call(long tel1, long tel2) {
        System.out.println("Samsung звонит от "+ tel1+" "+tel2);
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
