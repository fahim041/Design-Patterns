package gof.factory_method;

public class VeganBurgerStore extends BurgerStore{
    @Override
    public Burger createBurger() {
        return new VeganBurger("Vegan Burger", "hard");
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
