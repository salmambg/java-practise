import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n;
        System.out.println( " Enter the number : ");
        n = object.nextInt();

        for(int number =1; number <= n; number++) {
            for(int num= n; num >number; num--) {
                System.out.print(" ");
            }
            for(int i = 1; i<= number; i++) {
             System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
