package inheritance;

public class MethodOverridingTeacher extends MethodOverridingPerson {
    String qualification;
    @Override
    void DisInfo() {
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: "+qualification);
    }
}
