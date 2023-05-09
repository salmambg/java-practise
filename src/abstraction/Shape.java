package abstraction;

public abstract class Shape {
    double dime1,dim2;
    Shape(double dime1,double dim2) {
        this.dime1=dime1;
        this.dim2=dim2;
    }
    abstract void area();
}
