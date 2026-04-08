package HolidayTask-2.com.TaxiDispatch.payments;

public class PaymentService {

    public double processPayment(double fare) {

        if (fare <= 0) {
            throw new IllegalArgumentException("Invalid fare amount");
        }

        double tax = fare * 0.05;

        return fare + tax;
    }
}