package gof.template;

public class TransferMoneyTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("money transferred");
    }
}
