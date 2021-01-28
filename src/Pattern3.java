import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n;
        System.out.println(" Enter any integer : ");
        n = object.nextInt();

        for(int number = 1; number <= n; number++) {
            for(int num = 1; num <= number; num++ ) {
                System.out.print(number + " " );
            }
            System.out.println();
        }
    }
}
