package OOP;

public class SubClassMethod extends SuperMethod{
    @Override
    void Display () {
        super.Display();
        System.out.println("Inside Sub class");
    }
}
