package restart;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, fact=1 ;
        System.out.print(" Enter any integer number: ");
        num = input.nextInt();

        for (int i= num; i >= 1; i--) {
            fact= fact * i;
        }
        System.out.println(" factorial = "+fact);

    }
}
