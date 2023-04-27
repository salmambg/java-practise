package OOP;

public class StaticMethodTest {
    public static void main(String[] args) { //Main method is always static bso that we don't have to access or create any object
        StaticMethod s1= new StaticMethod();
        s1.Display1();

        StaticMethod.Display2();
    }
}
