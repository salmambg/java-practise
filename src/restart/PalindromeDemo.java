package restart;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int num,n, temp, sum=0;
        num= object.nextInt();
        temp=num;

        while (temp!=0) {
            n= temp%10;
            sum= sum*10 + n;
            temp=temp/10;
        }
        if(num==sum) {
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not a palindrome number");
        }
    }
}
