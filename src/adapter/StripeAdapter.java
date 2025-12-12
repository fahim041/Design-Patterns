package adapter;

// Stripe adapter
public class StripeAdapter implements PaymentProcessor {
    private final StripeClient stripeClient;

    public StripeAdapter(StripeClient stripeClient){
        this.stripeClient = stripeClient;
    }

    @Override
    public void processPayment(double amount) {
        stripeClient.makePayment(amount);
    }
}
