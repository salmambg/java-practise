package OOP;

public class Problem1 {
    double height,width,depth;

    Problem1(double h, double w, double d) {
        height=h;
        width=w;
        depth=d;
    }
    void displayVol() {
        double vol=height*width*depth;
        System.out.println("The volume is= "+vol);
        System.out.println();
    }
}
