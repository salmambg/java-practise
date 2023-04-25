package OOP;

public class Animals {
    String name;
    String Gender;
    int age;

    //OVERLOADING constructor

    Animals() {
        System.out.println("No information");
    }
    Animals(String n,String g) {
        name=n;
        Gender=g;

    }
    Animals(String n,String g,int a) {
        name=n;
        Gender=g;
        age=a;
    }
    void displayInformation() {
        System.out.println("Name ="+name);
        System.out.println("Gender ="+Gender);
        System.out.println("Age ="+age);
        System.out.println();
    }
}
