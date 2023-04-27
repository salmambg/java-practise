package OOP;

public class StaticBlock {
    static int f;
    static String name;

    static{
        f=101;
        name= "Salma";
    }
     static  void print() {
        System.out.println("id: "+f);
        System.out.println("Name: "+name);
    }
}
