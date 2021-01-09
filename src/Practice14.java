import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int n, sum= 0;
        System.out.print("Enter last number = ");
        n = object.nextInt();

        for(int number = 0; number<= n; number=number+2) {
            System.out.print(number + " "  );
            sum = sum+ number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
