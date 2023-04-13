package restart;

import java.util.Scanner;

public class PatternPractice8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any integer number: ");
        int number;
        number = input.nextInt();


        // * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * *
        for (int i = 1; i <= number; i++) { //i=1
            for (int j = 1; j <= number; j++) { //i=2,j=1
                if (i == 1 || i == number|| j == 1 || j == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
