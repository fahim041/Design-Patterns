package factory_method;

public class Client {
    public static void main(String[] args) {
        TransportFactoryType type = TransportFactoryType.BIKE;

        TransportFactory transportFactory = FactoryRegistry.getFactory(type);
        transportFactory.bookRide();
    }
}
