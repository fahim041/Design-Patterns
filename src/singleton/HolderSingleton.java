package singleton;

public class HolderSingleton {
    private HolderSingleton(){

    }

    public static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return Holder.INSTANCE;
    }
}
