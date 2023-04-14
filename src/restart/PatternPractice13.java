package restart;

public class PatternPractice13 {
    public static void main(String[] args) {

//     *
//   * * *
// * * * * *
//   * * *
//     *

        for (int i=1;i<=5;i+=2) {
            for (int j=1;j<=(5-i);j++) { //i=3,j=1
                System.out.print(" "); // space=2
            }
            for (int k=1;k<=i;k++) { //i=3,k=3
                System.out.print("* "); // * * *
            }
            System.out.println();
        }
        for (int i=3;i>=1;i-=2) {
            for (int j=1;j<=(5-i);j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
