package restart;

public class PatternPractice4 {
    public static void main(String[] args) {
//1
//2 1
//3 2 1
//4 3 2 1
//5 4 3 2 1

      for (int i=1;i<=5;i++) { // i = 1
          for (int j=i;j>=1;j--) {
              System.out.print(" "+j); //
          }
          System.out.println();
      }
    //       5
    //   4   5
    // 3 4 5
        //5
        //5 4
        //5 4 3
        //5 4 3 2
        //5 4 3 2 1

       for (int i = 5; i>= 1; i--) {
           for (int j =5; j>= i; j--) {
               System.out.print(" " + j);
           }
           System.out.println();
      }
    }
}
