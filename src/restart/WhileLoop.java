package restart;

public class WhileLoop {
    public static void main(String[] args) {
        int num=1;
        while (num<=5){
            System.out.println();
            int num1 =1;
            while (num1<=num) {
                System.out.print(" "+"*");
                num1++;
            }
            num++;
        }
        System.out.println();

        int i=1;
        while (i<=5) {
            System.out.println();
            int j=1;
            while (j<=i) {
                System.out.print(" "+j);
                j++;
            }
            i++;
        }
        System.out.println();
    }
}
