import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number1, number2;
        float number3;

        System.out.println("Enter number 1 ");
        number1 = object.nextInt();
        System.out.println("Enter number 2 ");
        number2 = object.nextInt();
        System.out.println("Enter number 3 ");
        number3 = object.nextFloat();

        int max = Math.max(number1, number2);
        System.out.println("maximum " + max);

        int min = Math.min(number1, number2);
        System.out.println("minimum " + min);

        int absolute = Math.abs(number1);
        System.out.println("absolute of number 1 : " + absolute);

        double power = Math.pow(number1,number2);
        System.out.println("power " + power);

        int round = Math.round(number3);
        System.out.println("round of number3 = " + round);
    }
}
