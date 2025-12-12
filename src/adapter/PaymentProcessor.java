package adapter;

// client use this interface for processing payment
public interface PaymentProcessor {
    void processPayment(double amount);
}
