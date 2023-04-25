package OOP;

public class test_animal {
    public static void main(String[] args) {

        Animals animal1=new Animals("Lion","Male");
        animal1.displayInformation();

        Animals animal2=new Animals("Hen","Female",5);
        animal2.displayInformation();

        Animals animal3=new Animals();
    }
}
