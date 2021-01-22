import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m, n;
        System.out.println("Enter initial number : ");
        m = object.nextInt();
        System.out.println("Enter final number : ");
        n = object.nextInt();

        for(int num = m; num <= n; num++) {
            System.out.println();
            System.out.println("Multiplication of " + num);
            for(int number = 1; number <= 10; number++ ) {
                System.out.println(num + " x " + number + " = " + num*number);
            }

        }

    }
}
