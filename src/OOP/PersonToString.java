package OOP;

public class PersonToString {
    String name;
    int age;

    PersonToString(String name,int age) {
        this.age=age;
        this.name=name;
    }
    @Override//we override it because it's a method of object class
    public String toString() {
        return "Name: "+name+"\n"+"Age: "+age;
    }

}
