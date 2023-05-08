package OOP;

public class PolyTest {
    public static void main(String[] args) {
        PolyPerson p1= new PolyPerson();
        p1.display();

        p1=new PolyTeacher();
        p1.display();

        p1= new PolyStudent();
        p1.display();




    }
}
