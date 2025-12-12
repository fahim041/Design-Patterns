package adapter;

// Third party client
public class StripeClient {
    public void makePayment(double total){
        System.out.println("Stripe: Paid "+ total);
    }
}
