package factory_method;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Bike is arriving...");
    }
}
