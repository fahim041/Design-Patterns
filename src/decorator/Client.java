package decorator;

public class Client {
    public static void main(String[] args){
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " => "+ coffee.getCost());

        coffee = new SugarDecorator(new MilkDecorator(coffee));
        System.out.println(coffee.getDescription() + " => "+ coffee.getCost());
    }
}
