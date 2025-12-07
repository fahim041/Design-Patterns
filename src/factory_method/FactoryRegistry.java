package factory_method;

import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {
    private static final Map<TransportFactoryType, TransportFactory> registry = new HashMap<>();

    static {
        registry.put(TransportFactoryType.TAXI, new TaxiFactory());
        registry.put(TransportFactoryType.BIKE, new BikeFactory());
    }

    public static TransportFactory getFactory(TransportFactoryType transportType) {
        return registry.get(transportType);
    }
}
