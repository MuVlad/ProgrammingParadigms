package homeWork_3.adapter.model;

public class SimpleAmericanSocket implements AmericanSoket{
    @Override
    public void supply_electricity(int voltage) {
        System.out.println("voltage: " + voltage);
    }
}
