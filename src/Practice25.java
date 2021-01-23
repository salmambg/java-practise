import java.util.Scanner;

public class  Practice25 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m,n;
        System.out.println( "Enter any integer number : ");
        m = object.nextInt();
        System.out.println( "Enter any integer number : ");
        n = object.nextInt();

        for(int number = m; number <= n; number++) {
            for (int num = 1; num <= number; num++) {
                System.out.printf(String.valueOf(num));
            }
            System.out.println();
        }
    }
}

