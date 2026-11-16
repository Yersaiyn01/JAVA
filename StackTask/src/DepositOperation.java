public class DepositOperation implements BankOperation{
    private final BankAccount account;
    private final double amount ;
    private double previousBalance;

    public DepositOperation(BankAccount account, double amount){
        this.account = account ;
        this.amount = amount;
    }

    public boolean execute(){
        previousBalance = account.getBalance();
        return account.deposit(amount);
    }
    @Override
    public void undo() {
        account.restoreBalance(previousBalance);
    }

}
