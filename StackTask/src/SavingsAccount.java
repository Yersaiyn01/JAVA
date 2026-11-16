public class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber,String OwnerName,double balance){
        super(accountNumber,OwnerName,balance);
    }

    @Override
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= getBalance()){
            decreaseBalance(amount);
            return true;
        }
        return false;
    }
}