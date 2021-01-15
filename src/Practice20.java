import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n, result = 1;
        System.out.print("Enter last number = ");
        n = object.nextInt();

        for(int number = 1; number <= n; number++){
            System.out.print(number+ "X" + number + " ");
            result = result * number * number;
        }
        System.out.println();
        System.out.println(result);
    }
}
