package lesson5;

public interface Telefon {
    int WEIGHT=10;

    void sendMessage(long tel1, long tel2, String sms);

    void call (long tel1,long tel2);

    int getPrice();

}
