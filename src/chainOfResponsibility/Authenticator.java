package chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        var isValid = (httpRequest.getUsername() == "admin" && httpRequest.getPassword() == "1234");

        System.out.println("Authentication");
        return !isValid;
    }
}
