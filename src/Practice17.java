import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n, result = 1;
        System.out.println("Enter last number : ");
        n = object.nextInt();

        for (int number = 1 ; number <= n; number++) {
            result = result * number;
        }
        System.out.println(result);
    }
}
