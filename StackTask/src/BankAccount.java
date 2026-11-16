public abstract class BankAccount {
    private final int accountNumber;
    private String OwnerName;
    private double  balance ;
    public BankAccount(int accountNumber,String OwnerName,double balance){
        this.accountNumber = accountNumber;
        this.OwnerName = OwnerName;
        this.balance = balance;
    }
    // setter
    public void setOwnerName(String ownerName){
        this.OwnerName = ownerName;
    }


    protected void decreaseBalance(double amount){
        balance -= amount;
    }

    public abstract boolean withdraw(double amount);


    // getter
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return OwnerName;
    }
    public double getBalance(){
        return balance;
    }
    //to string
    public String toString(){
        return "id: " + accountNumber
                + " name: " +OwnerName
                +" balance: " + balance;
    }

    public boolean deposit(double amount){
        if(amount > 0 && Double.isFinite(amount)){
            balance += amount ;
            return true;
        }
        return false;
    }

    public void restoreBalance(double previousBalance) {
        this.balance = previousBalance;
    }
}



