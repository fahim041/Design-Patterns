package observer;

public class Client {
    public static void main(String[] args){
        WeatherStation weatherStation = new WeatherStation();

        Phone phone = new Phone(weatherStation);
        Laptop laptop = new Laptop(weatherStation);

        weatherStation.addObserver(phone);
        weatherStation.addObserver(laptop);

        weatherStation.setTemperature(20);
        weatherStation.setTemperature(25);

    }
}
