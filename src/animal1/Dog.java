package animal1;

import animal2.Cow;

public class Dog {
    public static void main(String[] args) {
        Cat cat=new Cat();//because cat is also in animal package
        Cow cow= new Cow();//we have to import cow because its form different package

    }
}
