package abstraction;

public class SavingsAccount extends Account{
    public SavingsAccount(int AccountNumber, String AccountHolderName, double AccountBalance) {
        super(AccountNumber, AccountHolderName, AccountBalance);
    }

    @Override
    public void deposit(double amount) {
        double result=AccountBalance+amount;
        System.out.println("deposit: "+result);

    }
@Override
    public void withdraw(double amount) {
        double result=AccountBalance-amount;
    System.out.println("withdrawl: "+result);


    }
    @Override
    public  void CalculateInterest() {

    }

}
