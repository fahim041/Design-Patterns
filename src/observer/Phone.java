package observer;

// pull model
public class Phone implements Observer{
    private final Subject subject;

    public Phone(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Phone display: "+ subject.getTemperature());
    }
}
