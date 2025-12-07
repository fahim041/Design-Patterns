package factory_method;

public class TaxiFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Taxi();
    }
}
