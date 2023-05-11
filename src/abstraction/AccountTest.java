package abstraction;

public class AccountTest {
    public static void main(String[] args) {
        Account a;
        a=new SavingsAccount(456,"Nazmul",45667.0);
        a.deposit(65);
        a.withdraw(45);
        a.DisplayAccountDetails();

    }
}
