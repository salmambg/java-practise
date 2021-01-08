import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int sum = 0;
        int m,n;
        System.out.print("Enter initial number");
        m = object.nextInt();

        System.out.print("Enter final number");
        n = object.nextInt();

        for (int number = m; number <= n;number++) {
            if(number % 2 == 0)
             sum = sum + number;
        }
        System.out.println("The sum is : " +sum);
    }
}
