package encapsulation;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Salma" );
        System.out.println(p1.getName());

        p1.setAge(29);
        System.out.println(p1.getAge());

    }
}
