package strategy;

public class Client {
    public static void main(String[] args){
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CardPaymentStrategy("3233-4353"));
        paymentContext.pay(5644);

        paymentContext.setPaymentStrategy(new CryptoPaymentStrategy());
        paymentContext.pay(4345);
    }
}
