import java.awt.*;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double cels, farn;
        System.out.print("Celsius = ");
        cels = object. nextDouble();
        farn = 1.8 * cels + 32;
        System.out.println(" Farenheit : " + farn);

    }
}
