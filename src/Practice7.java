
public class Practice7 {
    public static void main(String[] args) {
        for( int number = 1; number<= 10; number++) {
            System.out.println();
            System.out.println( "multiplication of " + number);
            for (int numbersecond = 1; numbersecond<= 10; numbersecond++) {
                if (numbersecond % 2 == 0) {
                    System.out.println(number + " x " + numbersecond + " = " + number * numbersecond + " even");
                } else {
                    System.out.println(number + " x " + numbersecond + " = " + number * numbersecond + " odd");
                }
            }
        }
    }
}
