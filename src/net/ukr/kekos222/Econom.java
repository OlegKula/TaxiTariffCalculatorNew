package net.ukr.kekos222;

/**
 * Created by Олег on 13.03.2017.
 */
public class Econom implements Tariff {
    @Override
    public long calculateTariff(TaxiRide taxiRide) {
        return taxiRide.getDistance() * 3 + 25;
    }

    @Override

    public String toString() {
        return this.getClass().getName();
    }
}
