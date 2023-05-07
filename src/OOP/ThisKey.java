package OOP;

public class ThisKey {
    String name;
    int age;
    String color;

    ThisKey(String name,int age,String color) {
//        this.name=name;
//        this.age=age;
        this(name, age);
        this.color=color;
    }
    ThisKey(String name,int age) {
        this.name=name;
        this.age=age;
    }
    void Display () {
        System.out.println("name= "+name);
        System.out.println("age = "+age);
        System.out.println("Haircolor: "+color);
        System.out.println();
    }

}
