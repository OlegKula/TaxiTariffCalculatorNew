package net.ukr.kekos222;

/**
 * Created by Олег on 13.03.2017.
 */
public class TaxiRide {

    private final int passengers;
    private final int durarion;
    private final int distance;
    private final Tariff tariff;

    public TaxiRide(int passengers, int durarion, int distance, Tariff tariff){
        this.passengers = passengers;
        this.durarion = durarion;
        this.distance = distance;
        this.tariff = tariff;
    }


    public int getDurarion() {
        return durarion;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getDistance() {
        return distance;
    }

    public long calcPrice(){
        return tariff.calculateTariff(this);
    }

    @Override
    public String toString() {
        return "Passengers : " + passengers
                +"\nDuration : " + durarion
                +"\nDistance : " + distance
                +"\nTariff : " + tariff.toString();
    }
}
