package net.ukr.kekos222;

/**
 * Created by Олег on 13.03.2017.
 */
public interface Tariff {

   public long calculateTariff(TaxiRide taxiRide);

   public String toString();
}
