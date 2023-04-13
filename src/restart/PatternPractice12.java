package restart;

public class PatternPractice12 {
    public static void main(String[] args) {

 //     *
 //   * * *
 // * * * * *
//    * * *
//      *

        for (int i=1;i<=5;i+=2) {
            for (int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=5-2;i>=1;i-=2) {
            for (int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
