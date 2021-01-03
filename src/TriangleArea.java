import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double base,height,area;
        System.out.print("Enter base : ");
        base = object. nextDouble();
        System.out.print("Enter height : ");
        height = object. nextDouble();
        area = 0.5 * base * height;
        System.out.println("area = " + area);
    }
}
