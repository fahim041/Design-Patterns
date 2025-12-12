package singleton;

public class Client {
    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        logger.log("Singleton - 1");

        Logger logger1 = Logger.getInstance();
        logger.log("Singleton - 2");
    }
}