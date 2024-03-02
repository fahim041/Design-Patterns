import singleton.PrintService;

public class Main {
    public static void main(String[] args) {
        PrintService service1 = PrintService.getInstance();
        PrintService service2 = PrintService.getInstance();

        System.out.println(service1);
        System.out.println(service2);
    }
}