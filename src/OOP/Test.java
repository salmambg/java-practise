package OOP;

public class Test {
    public static void main(String[] args) {
//        Teacher teacher1;//object declare
//        teacher1=new Teacher();//object create

        Teacher teacher1=new Teacher();
        teacher1.name="Salma akter";
        teacher1.gender="Female";
        teacher1.phone = "01674535738";

       teacher1.displayInformation();

        System.out.println();//to make a new line you can also write this in method

        Teacher teacher2=new Teacher();
        teacher2.name="Salma Akter";
        teacher2.gender="Female";
        teacher2.phone = "01454535738";

       teacher2.displayInformation();


    }
}
