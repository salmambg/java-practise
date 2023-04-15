package restart;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1,n2, large;
        n1= input.nextInt();
        n2= input.nextInt();

        large =(n1>n2) ? n1: n2;
        System.out.print("large number : " +large);

    }
}
