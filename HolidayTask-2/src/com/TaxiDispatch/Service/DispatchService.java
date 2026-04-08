package com.TaxiDispatch.service;

import com.TaxiDispatch.models.*;

public class DispatchService {

    public Ride bookRide(Customer customer, double distance) {

        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than 0");
        }

        Taxi taxi;

        if (distance > 10) {
            taxi = new ElectricTaxi(2, "Suresh");
        } else {
            taxi = new Taxi(1, "Ravi");
        }

        taxi.setAvailable(false);

        return new Ride(taxi, customer, distance);
    }
}