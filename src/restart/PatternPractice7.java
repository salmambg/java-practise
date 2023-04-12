package restart;

public class PatternPractice7 {
    public static void main(String[] args) {

 //5 4 3 2 1
 //4 3 2 1
 //3 2 1
 //2 1
 //1

        for (int i=5;i>=1; i--) { //i=5
            for (int j=i;j>=1;j--) {
                System.out.print(" "+j);
            }
            for (int k=1;k<=(5-i);k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
