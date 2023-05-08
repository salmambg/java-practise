package OOP;

public class PolyTriangle extends PolyShape {
    double base,height;
    PolyTriangle (double base,double height) {
        this.base=base;
        this.height=height;
    }

    @Override
    double area() {
        return base*height*0.5;
    }

}
