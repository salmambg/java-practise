import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n;
        System.out.println(" Enter any integer number");
        n = object.nextInt();

        for(int number = 1 ; number<= n; number++) {
            for(int num = 1; num<= number; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
