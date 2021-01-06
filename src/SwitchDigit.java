import java.util.Scanner;

public class SwitchDigit {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int digit;
        System.out.print("Enter any digit : ");
        digit = object.nextInt();
        switch (digit) {
            case 1 :
                System.out.println("zero");
                break;
            case 2 :
                System.out.println("one");
                break;
            case 3 :
                System.out.println("two");
                break;
            case 4 :
                System.out.println("three");
                break;
            case 5 :
                System.out.println("four");
                break;
            case 6 :
                System.out.println("five");
                break;
            default:
                System.out.println("wrong input");

        }
    }
}
