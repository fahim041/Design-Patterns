package factory_method;

public class Store {
    public static void runStore(){
        BurgerStore burgerStore = new CheeseBurgerStore();
        burgerStore.createBurger();
        burgerStore.order();
    }
}
