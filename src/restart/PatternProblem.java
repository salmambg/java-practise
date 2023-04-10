package restart;

import java.util.Scanner;

public class PatternProblem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter line numbers: ");
        int n= input.nextInt();//The input is stored in the variable "n".

        for (int row=1; row <=n; row++) {
            for (int col= 1; col<=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
