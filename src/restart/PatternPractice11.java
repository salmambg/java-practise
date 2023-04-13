package restart;

import java.util.Scanner;

public class PatternPractice11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter any odd number: ");
        int num;
        num = input.nextInt();

 // * * * * *
//   * * * *
 //   * * *
//     * *
 //     *



        for (int i= num;i>=1;i--) {
            for (int j=i;j<=num;j++) {
                if (j!=num) {
                    System.out.print(" ");
                }
            }
            for (int j= 1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
