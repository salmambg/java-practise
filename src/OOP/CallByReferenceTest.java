package OOP;

public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference r1=new CallByReference();
        r1.name="Nazmul";
        System.out.println("Before calling name: "+r1.name);

        r1.change(r1);
        System.out.println("After Calling name: "+r1.name );
    }
}
