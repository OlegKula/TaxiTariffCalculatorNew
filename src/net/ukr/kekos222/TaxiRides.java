package net.ukr.kekos222;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Олег on 13.03.2017.
 */
public class TaxiRides {

    private List<TaxiRide> rides = new ArrayList<>();

    public TaxiRides addRide(TaxiRide ride){
        rides.add(ride);
        return this;
    }

    public long getPrise(){
        long price = 0;
        for (TaxiRide ride : rides) {
            price += ride.calcPrice();
        }
        return price;
    }
}
