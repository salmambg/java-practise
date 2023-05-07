package final_keyword;

public class Student extends UniversityA{
    void display2() { //final method can not be over ride but it is automatically inherited
        System.out.println("Student info");
    }
}
