package homeWork_3.adapter;

import homeWork_3.adapter.model.AmericanSoket;
import homeWork_3.adapter.model.EuropeSocket;

public class USPlugAdapter implements EuropeSocket {
    AmericanSoket americanSoket;

    public USPlugAdapter(AmericanSoket soket) {
        this.americanSoket = soket;
    }

    @Override
    public void supply_electricity(int voltage) {

        americanSoket.supply_electricity(voltage);
    }
}
