package restart;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        n= input.nextInt();
        for (int i=1;i<=n;i++) {
            fact=fact*i;
        }
        System.out.println("The factorial of this number is: "+fact);
    }
}
