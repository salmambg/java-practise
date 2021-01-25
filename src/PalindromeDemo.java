import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number, n, temp, sum = 0;
        System.out.println(" Enter any integer : ");
        number= object.nextInt();
        temp = number;

        while(temp!= 0) {
            n = temp % 10;
            sum = sum*10 + n;
            temp = temp/10;
        }
        if( number == sum) {
            System.out.println( " Palindrome number");
        }else {
            System.out.println( " Not a palindrome number");
        }
    }
}
