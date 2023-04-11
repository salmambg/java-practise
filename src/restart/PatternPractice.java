package restart;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PatternPractice {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter any integer: ");
        //int n= input.nextInt();
//*
//* *
//* * *
//* * * *
//* * * * *
        for(int n=1; n<=5; n++) {
            for (int n1= 1; n1<=n; n1++) {
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        System.out.println();
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println();

//12345
//1234
//123
//12
//1

        for(int number=5;number >=1;number--) {
            // number 5 4 3 2 1
            for(int number2 =1; number2 <=number;number2++) { // 2
                System.out.print(" "+number2); //  1 2
                // hidden line number2 = number2 + 1
            }
            System.out.println();
            // hidden line number = number - 1 // 1
        }
    }
}
