package abstraction;

public class Circle extends Shape{
    Circle(double r) {
       super(r,r);
    }
    void area() {
        double result=Math.PI* dime1*dim2;
        System.out.println("The area of Circle is: "+result);
    }
}
