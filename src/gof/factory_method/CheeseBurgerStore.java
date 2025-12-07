package gof.factory_method;

public class CheeseBurgerStore extends BurgerStore{
    @Override
    public Burger createBurger() {
        return new CheeseBurger("Cheese Burger", "soft");
    }

    @Override
    public Burger order() {
        Burger burger = createBurger();
        System.out.println("Making "+ burger.getName() + " with " + burger.getBread() + " bread");
        burger.prepare();
        burger.cook();
        burger.serve();
        return burger;
    }
}
