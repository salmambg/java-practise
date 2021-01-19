import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m , n;
        System.out.print("Enter initial number : ");
        m = object.nextInt();
        System.out.print("Enter final number : ");
        n = object.nextInt();

        for(int number =m ; number <= n; number++) {
            System.out.println();
            System.out.println("Multiplication of " + number);

            for(int numberSecond = 1; numberSecond <= 10; numberSecond++) {
                System.out.println(number + " X " + numberSecond + " = " + number*numberSecond);
            }

        }
    }
}
