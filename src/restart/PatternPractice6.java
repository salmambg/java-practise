package restart;

public class PatternPractice6 {
    public static void main(String[] args) {

 // 1 2 3 4 5
 // 1 2 3 4
 // 1 2 3
 // 1 2
 // 1

        for(int i=5; i>=1; i--) { //i =5
            for (int j =1; j<=i; j++) {
                System.out.print(" "+j);
            }
            for (int k=1; k<=(5-i);k++) { //i=5
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
