package abstraction;

public abstract class Account {
   protected int AccountNumber;
   protected String AccountHolderName;
   protected double AccountBalance;

    public Account(int AccountNumber,String AccountHolderName,double AccountBalance) {
        this.AccountBalance=AccountBalance;
        this.AccountHolderName=AccountHolderName;
        this.AccountNumber=AccountNumber;
    }


     public abstract void deposit(double amount);
     public abstract void withdraw(double amount);
     public abstract void CalculateInterest();

    void DisplayAccountDetails() {
        System.out.println("Account number: "+AccountNumber);
        System.out.println("Account Holder Name: "+ AccountHolderName);
        System.out.println("Account balance: "+ AccountBalance);
    }
}
