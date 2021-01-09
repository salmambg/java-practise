import java.util.Scanner;

public class SeriesDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n,sum = 0;
        System.out.print("Enter last number = ");
        n = object.nextInt();

        for(int number = 0; number<= n; number++){
             sum = sum + number;

        }
        System.out.println(sum);

    }
}
