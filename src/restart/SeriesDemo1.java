package restart;

import java.util.Scanner;

public class SeriesDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Enter any integer number: ");
        n = input.nextInt();

        for (int i=1;i<=n;i++) {
            System.out.print(i+"x"+i+" ");
            sum=sum+i*i;
        }
        System.out.println(sum);
    }
}
