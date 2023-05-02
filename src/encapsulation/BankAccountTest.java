package encapsulation;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount p1=new BankAccount();
        p1.setAccountHolderName("Nazmul");
        System.out.println(p1.getAccountHolderName());

        p1.setAccountNumber(234578);
        System.out.println(p1.getAccountNumber());

        p1.setBalance(20000);
        System.out.println(p1.getBalance());
    }
}
