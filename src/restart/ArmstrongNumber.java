package restart;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int number,n, temp, sum=0;
        number= input.nextInt();
        temp=number;

        while (temp!=0) {
            n = temp%10;
            sum= sum+ n*n*n;
            temp=temp/10;
        }
        if(sum==number){
            System.out.println("This is a armstrong number");
        }else{
            System.out.println("This is not  armstrong number");
        }
    }
}
