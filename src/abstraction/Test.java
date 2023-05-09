package abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser ms;//reference variable
        ms =new person();
        ms.sendMessage();
        ms.call();

        ms= new Person1();
        ms.sendMessage();
        ms.call();

    }
}
