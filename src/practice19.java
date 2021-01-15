import java.util.Scanner;

public class practice19 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        double n, result= 1;
        System.out.print("Enter last number = ");
        n = object.nextDouble();

        for(double number = 1.5; number <= n; number++){
            result = result * number;
        }
        System.out.println(result);

    }
}
