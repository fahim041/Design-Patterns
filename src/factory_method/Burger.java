package factory_method;

public abstract class Burger {
    private String name;
    private String bread;

    public Burger(String name, String bread) {
        this.name = name;
        this.bread = bread;
    }

    public void prepare(){

    }

    public void cook(){

    }

    public void serve(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}
