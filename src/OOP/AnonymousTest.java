package OOP;

public class AnonymousTest {
    public static void main(String[] args) {
        Anonymous a=new Anonymous() {
            @Override
            void Display() {
                System.out.println("Test Class");
            }
        };
        a.Display();
    }
}
