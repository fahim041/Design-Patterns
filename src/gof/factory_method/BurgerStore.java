package gof.factory_method;

public abstract class BurgerStore {
    public abstract Burger createBurger();

    public abstract Burger order();
}
