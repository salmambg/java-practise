package OOP;

public class ThisTest {
    public static void main(String[] args) {
        ThisKey t1= new ThisKey("Salma",23);
        t1.Display();

        ThisKey t2= new ThisKey("Salma",23,"red");
        t2.Display();
    }
}
