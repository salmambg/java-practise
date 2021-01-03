import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double farn, cels;
        System.out.print("Enter Farenheit : ");
        farn = object. nextDouble();
        cels = 0.56 * (farn - 32);
        System.out.println(" Celsius : " + cels );
    }
}
