import java.io.PrintStream;

public class PracticeTriangle {
    public static void main(String[] args) {
        for (int number = 5; number >= 1; number--) {
            for (int numbersecond = number; numbersecond >= 1; numbersecond--){
                System.out.print(numbersecond + " ");
            }
            System.out.println();
        }
    }
}