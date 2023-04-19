package array_demo;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {

   //col  0 1 2
// row 0= 1 2 3
// row 1= 4 5 6
// row 2= 7 8 9

        Scanner input = new Scanner(System.in);
        int[][] A= new int[3][3];
        int SumOfDiagonalElements =0;
        int SumOfUpperElements=0;
        int SumOfLowerElements =0;

        for (int row=0;row<3;row++) {
            for (int col=0;col<3;col++) {
                A[row][col]= input.nextInt();
            }
        }
        for (int row=0;row<3;row++) {
            for (int col=0;col<3;col++) {
               if (row==col) {
                   SumOfDiagonalElements=SumOfDiagonalElements +A[row][col];
               }
               if (row<col) {
                   SumOfUpperElements= SumOfUpperElements+A[row][col];
               }
               if (row>col) {
                  SumOfLowerElements=SumOfLowerElements+ A[row][col];
               }
            }
        }
        System.out.println("SumOfDiagonalElements =" +SumOfDiagonalElements);
        System.out.println("SumOfUpperElements="+ SumOfUpperElements);
        System.out.println("SumOfLowerElements="+SumOfLowerElements);

    }
}
