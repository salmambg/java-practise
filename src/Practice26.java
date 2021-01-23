import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m, n;
        System.out.println(" Enter initial integer :  ");
        m = object.nextInt();
        System.out.println(" Enter final integer:  ");
        n = object.nextInt();

        for(int number = m; number >=n; number--) {
            for(int num = number; num >= 1; num--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
