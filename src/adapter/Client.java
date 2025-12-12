package adapter;

public class Client {
    public static void main(String[] args){
        CheckoutService service1 = new CheckoutService(new PayPalAdapter(new PayPalClient()));
        service1.completeOrder(40.35);

        CheckoutService service2 = new CheckoutService(new StripeAdapter(new StripeClient()));
        service2.completeOrder(33.99);
    }
}
