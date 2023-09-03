package homeWork_3.adapter;

import homeWork_3.adapter.model.AmericanSoket;
import homeWork_3.adapter.model.EuropeSocket;
import homeWork_3.adapter.model.Radio;
import homeWork_3.adapter.model.SimpleAmericanSocket;

public class Main {
    public static void main(String[] args) {
        AmericanSoket americanSoket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuropeSocket europeSocket = new USPlugAdapter(americanSoket);
        radio.radioOn(europeSocket);
    }
}
