public class WithdrawOperation implements BankOperation {
    private final BankAccount account;
    private final double amount;
    private double previousBalance;

    public WithdrawOperation(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public boolean execute() {
        previousBalance = account.getBalance();
        return account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.restoreBalance(previousBalance);
    }
}