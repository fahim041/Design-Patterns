package adapter;

// PayPal adapter
public class PayPalAdapter implements PaymentProcessor{
    private final PayPalClient payPalClient;

    public PayPalAdapter(PayPalClient payPalClient){
        this.payPalClient = payPalClient;
    }

    @Override
    public void processPayment(double amount) {
        payPalClient.sendPayment(String.valueOf(amount));
    }
}
