package observer;

import java.util.ArrayList;
import java.util.List;

// pull model
public class WeatherStation implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
