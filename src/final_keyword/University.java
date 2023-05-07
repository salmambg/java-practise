package final_keyword;

public class University {
    final String name="DU";
    static final int fee;//static block final variable

    static { //to declare static final variable use static block
        fee=233;
    }

    void display() {
        System.out.println("name: "+name);
        System.out.println("fee: "+fee);
    }


}
