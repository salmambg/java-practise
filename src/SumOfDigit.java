import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number, n, temp, sum= 0;
        System.out.println("Enter any integer number : ");
        number = object.nextInt();
        temp = number;

        while(temp!= 0) {
            n = temp%10;
            sum = sum + n;
            temp = temp/10;
        }
        System.out.println(" Sum of digit = " + sum);
    }
}
