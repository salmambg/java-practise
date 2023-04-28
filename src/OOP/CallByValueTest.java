package OOP;

public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob=new CallByValue();
        int x=10;
        System.out.println("Before calling: "+x);

        ob.change(x);
        System.out.println("After Calling: "+x);
    }
}
