package strategy;

public class ShadeFilter implements Filter{

    @Override
    public void Filter(String fileName) {
        System.out.println("using shade filter");
    }
}
