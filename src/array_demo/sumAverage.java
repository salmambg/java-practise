package array_demo;

import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum= 0;
        System.out.print(" Enter 5 numbers: ");

        for(int i =0; i<5; i++) {
            number[i]= input.nextDouble();
        }

        //sum= number[0] + number[1] + number[2] + number[3] + number[4];
        for (int i=0; i<5; i++) {
            sum = sum+ number[i];
        }
        System.out.println("The sum is : "+ sum);
        System.out.println("The average is : "+ sum/5);

        //double avg = sum/5
        //System.out.println ("the avg is =0"+sum)


    }
}
