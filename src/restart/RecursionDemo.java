package restart;

import java.util.Scanner;

public class RecursionDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        number= input.nextInt();
        System.out.println("The factorial is : "+factorial(number));

    }
    public static int factorial (int n) { //n=5
        if (n==1) {
            return 1;
        }else {
            return n*factorial(n-1);//5*factorial(5-1)
        }
    }
}
