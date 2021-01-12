import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n , result = 1;
        System.out.print("Enter last number = ");
        n = object.nextInt();

        for(int number = 1; number <= n; number = number +2) {
            result = result * number;
        }
        System.out.println(result);
    }
}
