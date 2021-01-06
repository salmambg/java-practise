import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number1, number2, small;
        System.out.print("Enter any 2 number");
        number1 = object.nextInt();
        number2 = object.nextInt();
        small = (number1 < number2) ? number1 : number2;
        System.out.println("small number = " + small);
    }
}
