package observer;

public class Laptop implements Observer{
    private final Subject subject;

    public Laptop(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Laptop display: "+ subject.getTemperature());
    }
}
