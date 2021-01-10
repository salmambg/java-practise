import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double n, sum = 0;
        System.out.print("Enter the last number");
        n = object.nextDouble();

        for(double number = 1.5; number <= n; number++) {
            System.out.print(number + " " );
            sum = sum + number;
        }
        System.out.println();
        System.out.println("The sum is = " + sum);
    }
}
