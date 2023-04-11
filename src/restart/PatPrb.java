package restart;

public class PatPrb {
    public static void main(String[] args) {

   //     5
   //    45
   //   345
   //  2345
   // 12345

//      for (int i=1;i<=5;i++) { //i=3
//          for (int j=1; j<=(5-i);j++) {//i=3,j=1
//              System.out.print(" ");//2 space
//          }
//          for (int k=1;k<=i;k++) { //i=3
//              System.out.print("*"); //***
//          }
//          System.out.println();
//      }

        for (int i=5;i>=1;i--) { //i=4
          for (int j=1; j<=(i-1);j++) {//i=4,j=1
              System.out.print(" ");//2 space
          }
          for (int k=i;k<=5;k++) { //i=3
              System.out.print(k); //***
          }
          System.out.println();
      }
    }

}
