package OOP;

public class PolyRectangle extends PolyShape {
    double length,width;
    PolyRectangle(double length,double width) {
        this.length=length;
        this.width=width;
    }

    @Override
    double area() {
        return length*width;
    }
}
