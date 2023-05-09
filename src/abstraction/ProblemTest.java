package abstraction;

public class ProblemTest {
    public static void main(String[] args) {
        Shape s;
        s=new Circle(3);
        s.area();

        s=new Rectangle(3,4);
        s.area();

        s=new Triangle(3,4);
        s.area();
    }
}
