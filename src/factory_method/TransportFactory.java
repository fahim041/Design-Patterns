package factory_method;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void bookRide() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
