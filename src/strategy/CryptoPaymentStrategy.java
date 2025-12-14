package strategy;

public class CryptoPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using crypto account");
    }
}
