import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int value, fact = 1;
        System.out.print("Enter any positive integer : ");
        value = object.nextInt();

        for(int number = value; number >= 1; number--) {
            fact = fact * number;
        }
        System.out.println("Factorial of " + value + " = " + fact);

    }
}
