package homeWork_3.adapter.model;

public class Radio {
    private static final int voltage = 220;
    public void radioOn(EuropeSocket soket) {
        soket.supply_electricity(voltage);
    }
}
