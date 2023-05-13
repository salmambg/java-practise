package OOP;

public class StringTest {
    public static void main(String[] args) {
        PersonToString p1= new PersonToString("Salma",27);
        PersonToString p2= new PersonToString("Nazmul",29);
        System.out.println(p2);// by default toString method is called
        System.out.println(p1);
    }
}
