package modifier2;

import modifier1.A;

public class C extends A { //t access protected class we have to extend the class
    public static void main(String[] args) {//to access public modifier from another package you have to import the package of this class
        A c= new A();//public access modifier obj
        c.display();

        C x=new C();// protected access modifier obj
        x.display();
    }

}
