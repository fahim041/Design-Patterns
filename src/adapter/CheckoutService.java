package adapter;

public class CheckoutService {
    private final PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void completeOrder(double amount){
        paymentProcessor.processPayment(amount);
    }
}
