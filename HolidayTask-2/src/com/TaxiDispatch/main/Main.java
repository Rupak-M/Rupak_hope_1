package com.TaxiDispatch.main;

import com.TaxiDispatch.models.*;
import com.TaxiDispatch.service.DispatchService;
import com.TaxiDispatch.payments.PaymentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Customer ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Distance: ");
            double distance = sc.nextDouble();

            Customer customer = new Customer(id, name);

            DispatchService service = new DispatchService();
            Ride ride = service.bookRide(customer, distance);

            PaymentService paymentService = new PaymentService();
            double finalAmount = paymentService.processPayment(ride.getFare());

            System.out.println("\n--- Ride Details ---");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Driver: " + ride.getTaxi().getDriverName());
            System.out.println("Distance: " + ride.getDistance());
            System.out.println("Fare (with tax): " + finalAmount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}