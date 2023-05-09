package abstraction;

public class Rectangle extends Shape{

    Rectangle(double dime1,double dim2) {
        super(dime1, dim2);
    }
    void area() {
        double result=dime1*dim2;
        System.out.println("the area of rectangle is: "+result);
    }
}
