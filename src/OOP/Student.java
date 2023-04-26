package OOP;

public class Student {

    Student(String n,int i) {
        name=n;
        id=i;
    }
    String name;
    int id;
    static String universityName= "NSTU";

    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("University name: "+universityName);
        System.out.println();
    }

}
