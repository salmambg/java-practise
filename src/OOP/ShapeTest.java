package OOP;

public class ShapeTest {
    public static void main(String[] args) {

//        PolyShape s1= new PolyShape();
//        System.out.println("Shape area: "+s1.area());
//
//        s1= new PolyRectangle(3,4);
//        System.out.println("Shape area: "+s1.area());
//
//        s1 = new PolyTriangle(3,4);
//        System.out.println("Shape area: "+s1.area());
        PolyShape[]s=new PolyShape[3];
        s[0]=new PolyShape();
        s[1]=new PolyRectangle(3,4);
        s[2]=new PolyTriangle(3,4);
//
//        System.out.println("Shape area: "+s[0].area());
//        System.out.println("Shape area: "+s[1].area());
//        System.out.println("Shape area: "+s[2].area());

        for (int i=0;i<3;i++) {
            System.out.println("Shape area: "+s[i].area());
        }




    }
}
