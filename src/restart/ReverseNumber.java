package restart;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number, n, temp, sum=0;
        System.out.print("Enter any positive integer : ");
        number = object.nextInt();
        temp = number;

        while(temp!=0) {
            n = temp%10;
            sum= sum*10 +n;
            temp= temp/10;
        }
        System.out.println("Reverse: "+ sum);

    }
}
