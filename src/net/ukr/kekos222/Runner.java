package net.ukr.kekos222;

/**
 * Created by Олег on 13.03.2017.
 */
public class Runner {

    public static void main(String[] args) {

        TaxiRides rides = new TaxiRides();

        TaxiRide ride = new TaxiRide(4,25,100, new Standart());

        rides.addRide(ride).addRide(new TaxiRide(6,30,125,new Econom()));

        System.out.println(ride.toString());

        System.out.println(rides.getPrise());
    }
}
