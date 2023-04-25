package OOP;

public class Teacher {

    Teacher(String n,String g,String p) {//there is no return type
        name =n;
        gender=g;
        phone =p;

    }
    String name,gender;
    String phone;

    void setInformation(String n,String m, String phn) {
        name=n;
        gender=m;
        phone=phn;

    }

    void displayInformation() { //return type like void and then method name
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: "+phone);

    }

}
