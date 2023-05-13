package OOP;

public class StringComparison {
    public static void main(String[] args) {
        String p1="Salma";
        String p2= "Salma";
        String p3 =new String("Salma");
        String p4= new String("Salma");


        System.out.println(p1.equals(p2));// equals operator compare the content between them.
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p4));
        System.out.println(p1==p2);// == operator compare reference variable or object. this new keyword making a new place or memory in StringPool
        System.out.println(p1==p3);
        System.out.println(p3==p4);

    }
}
