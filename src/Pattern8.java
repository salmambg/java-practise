import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n;
        System.out.println(" Enter any integer:  ");
        n = object.nextInt();

        for(int number = n; number >= 1; number--) {
            for(int num = number; num >=1; num--) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
