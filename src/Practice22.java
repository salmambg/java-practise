import java.util.Scanner;

public class Practice22 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int m, n;
        boolean isPrime = true;
        System.out.println("enter initial integer : ");
        m = object.nextInt();
        System.out.println("enter final integer : ");
        n = object.nextInt();
        for(int num = m; num<=n; num++){
            isPrime = true;
            for (int number = 2; number<num; number++) {
                if (num%number == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number " + num);
            }
        }

    }
}

