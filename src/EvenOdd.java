import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter any integer number ");
        int number = object.nextInt();
        if ( number % 2 == 0){
            System.out.println("even");
        } else
            System.out.println("odd");
    }
}
