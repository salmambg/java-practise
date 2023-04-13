package restart;

import java.util.Scanner;

public class PatternPractice7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int num;
        num = input.nextInt();
 //5 4 3 2 1
 //4 3 2 1
 //3 2 1
 //2 1
 //1

        for (int i=num;i>=1; i--) { //i=5
            for (int j=i;j>=1;j--) {
                System.out.print(" "+j);
            }
            for (int k=1;k<=(num-i);k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
