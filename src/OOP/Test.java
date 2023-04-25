package OOP;

public class Test {
    public static void main(String[] args) {
//        Teacher teacher1;//object declare
//        teacher1=new Teacher();//object create

//        Teacher teacher1=new Teacher();
//        teacher1.setInformation("Salma Akter","Female","0167453575");
//        teacher1.displayInformation();
//
//        System.out.println();//to make a new line you can also write this in method
//
//        Teacher teacher2=new Teacher();
//        teacher2.setInformation("G M Nazmul","male","55234388");
//        teacher2.displayInformation();

// Here I can use constructor to initialize the object when the object is created with new operator
        //we don't need to call constructor.


          Teacher teacher1=new Teacher("Salma Akter","Female","0167453575");
          teacher1.displayInformation();

          System.out.println();//to make a new line you can also write this in method

          Teacher teacher2=new Teacher("G M Nazmul","male","55234388");
          teacher2.displayInformation();
    }
}
