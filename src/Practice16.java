import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter last number : ");
        n = object.nextInt();

        for (int number = 1; number <= n; number++) {
            System.out.print( number + "X" +number + " ");
            sum = sum + number*number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
