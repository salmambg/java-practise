import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m, sum;
        System.out.println(" Enter any integer : ");
        m = object.nextInt();
        int number1 = 0;
        int number2 = 1;
        System.out.print(number1 + " " + number2);

        for (int count = 3; count <= m; count++) {
            sum = number1 + number2;
            if (sum > m)
                break;
            System.out.print(" " + sum);
            number1 = number2;
            number2 = sum;
        }
    }
}


