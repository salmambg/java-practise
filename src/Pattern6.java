import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n;
        System.out.println(" Enter any integer : ");
        n = object.nextInt();

        for(int number = n; number>= 1; number--) {
            for(int num = number; num >= 1; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
