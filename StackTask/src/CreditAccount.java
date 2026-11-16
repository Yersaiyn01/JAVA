public class CreditAccount extends BankAccount{
    private final double creditLimit;
    public CreditAccount(int accountNumber,String OwnerName,double balance,double creditLimit){
        super(accountNumber,OwnerName,balance);
        this.creditLimit = creditLimit;
    }
    @Override
    public boolean withdraw(double amount){
        if (amount > 0 && getBalance() - amount >= -creditLimit) {
            decreaseBalance(amount);
            return true;
        }
        return false;
    }

}

