package restart;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int number;
        number= input.nextInt();

        if (number>=80 && number<=100) {
            System.out.println("A+");
        } else if (number>=60 && number<=70) {
            System.out.println("A");
        }
        else if (number>=50 && number<=60) {
            System.out.println("A-");
        }
        else if (number>=40 && number<=50) {
            System.out.println("B");
        }
        else if (number>=30 && number<=40) {
            System.out.println("C");
        }else {
            System.out.println("fail");
        }
    }
}
