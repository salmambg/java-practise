package restart;

public class PatternPractice5 {
    public static void main(String[] args) {

// * * * * *
// * * * *
// * * *
// * *
// *
        for (int i=5; i>=1;i--) { //i=4
            for (int j= 1;j<=i;j++){ //i=4,j=1
                System.out.print("*");
            }
            for (int k=1;k<=(5-i);k++){ //i=4
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
