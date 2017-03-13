package net.ukr.kekos222;

/**
 * Created by Олег on 13.03.2017.
 */
public class Standart implements Tariff {

    @Override

    public long calculateTariff(TaxiRide taxiRide) {
        return 30+ taxiRide.getPassengers() * 2 + taxiRide.getDistance() * 2;
    }

    @Override

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
