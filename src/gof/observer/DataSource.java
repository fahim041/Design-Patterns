package gof.observer;

public class DataSource extends Subject {
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
        notifyObservers();
    }
}
