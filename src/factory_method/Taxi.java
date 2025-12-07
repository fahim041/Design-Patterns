package factory_method;

public class Taxi implements Transport {
    @Override
    public void deliver() {
        System.out.println("Taxi is arriving...");
    }
}
