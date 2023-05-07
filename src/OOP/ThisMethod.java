package OOP;

public class ThisMethod {
    void message() {
        System.out.println("I am message");
    }
    void Display() {
        this.message();
        System.out.println("I am display");
    }
}
