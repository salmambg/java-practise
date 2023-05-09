package abstraction;

public class Triangle extends Shape {
    Triangle(double dime1,double dim2) {
        super(dime1, dim2);
    }
    void area() {
        double result=0.5*dime1*dim2;
        System.out.println("The area of Triangle is: "+result);
    }
}
