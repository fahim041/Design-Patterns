package adapter;

// Third party client
public class PayPalClient {
    public void sendPayment(String amount){
        System.out.println("PayPal: Paid "+ amount);
    }
}
