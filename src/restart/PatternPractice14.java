package restart;

public class PatternPractice14 {
    public static void main(String[] args) {

 // * * * * *
 //  * * * *
 //   * * *
 //    * *
 //     *
 //    * *
 //   * * *
 //  * * * *
 // * * * * *

        for (int i=5;i>=1;i--) { //i=
            for (int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=2;i<=5;i++) {
            for (int j=1;j<=(5-i);j++) { //i=2,j=1
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
