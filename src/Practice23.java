import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m, n;
        System.out.println("Enter initial integer : ");
        m = object.nextInt();
        System.out.println(" Enter final integer : ");
        n = object.nextInt();

        for(int number = 1; number <= 10; number++) {
            System.out.println(m + " x " + number + " = " + m*number);
        }
    }
}
