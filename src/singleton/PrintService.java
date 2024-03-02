package singleton;

public class PrintService {
    private static PrintService instance = null;
    private String mode = null;

    private PrintService() {
        mode = "GrayScale";
    }

    public static PrintService getInstance(){
        if(instance == null){
            instance = new PrintService();
        }
        return instance;
    }

    public String getMode(){
        return mode;
    }

    public void setMode(String mode){
        this.mode = mode;
    }
}
