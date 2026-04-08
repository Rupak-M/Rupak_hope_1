package com.TaxiDispatch.models;

public class Taxi {
    private int taxiId;
    private String driverName;
    private boolean available;

    public Taxi(int taxiId, String driverName) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.available = true;
    }

    public int getTaxiId() { return taxiId; }
    public String getDriverName() { return driverName; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public double calculateFare(double distance) {
        return distance * 10;
    }
}

class ElectricTaxi extends Taxi {

    public ElectricTaxi(int taxiId, String driverName) {
        super(taxiId, driverName);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 8;
    }
}

class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
}

class Ride {
    private Taxi taxi;
    private Customer customer;
    private double distance;
    private double fare;

    public Ride(Taxi taxi, Customer customer, double distance) {
        this.taxi = taxi;
        this.customer = customer;
        this.distance = distance;
        this.fare = taxi.calculateFare(distance);
    }

    public Taxi getTaxi() { return taxi; }
    public Customer getCustomer() { return customer; }
    public double getDistance() { return distance; }
    public double getFare() { return fare; }
}