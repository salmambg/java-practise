import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter radius : ");
        radius = object. nextDouble();
        area = 3.1416 * radius * radius;
        System.out.println("Area of Circle : " + area);

    }
}
