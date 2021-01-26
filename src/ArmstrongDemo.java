import java.util.Scanner;

public class ArmstrongDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number, temp, n, sum =0;
        System.out.println(" Enter any integer : ");
        number = object.nextInt();
        temp = number ;

        while(temp != 0) {
            n = temp % 10;
            sum = sum + n*n*n;
            temp = temp/10;
        }if(sum == number) {
            System.out.println( " armstrong number");
        }else {
            System.out.println(" Not a armstrong number");
        }
    }
}
