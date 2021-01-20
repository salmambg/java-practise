import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter any integer number : ");
        int number = object.nextInt();
        boolean isPrime = true;
        for(int num = 2; num< number; num++ ){
            if(number% num == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(" Prime Number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
