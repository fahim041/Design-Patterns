package strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void Filter(String fileName) {
        System.out.println("Using black and white filter");
    }
}
