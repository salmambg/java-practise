import java.util.Scanner;

public class ABCTriangle {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int input, count;
        System.out.println(" Enter any integer: ");
        input = object.nextInt();
        for(int number = 1; number <= input; number--) {
            count=0;
            for(char letter= 'A'; letter <= 'Z'; letter++) {
                if(count == number) {
                    break;
                }
                System.out.print(letter + "");
                count++;
            }
            System.out.println();
        }

    }
}
