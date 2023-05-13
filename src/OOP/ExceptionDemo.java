package OOP;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int x=10;
            int y=0;
            int result= x/y;
            System.out.println(result);//which line that exception occurs after that no line can work .
            System.out.println("ER");//which line that exception occurs after that no line can work .
        }catch (ArithmeticException e) { // only the right exception error should match with the catch block or we can write only exception which works for all exception error
            System.out.println("Exception: "+e);
         }//}catch (Exception e2) {
//            System.out.println(e2);
//        }
        finally { // if the exception error is not match in catch block and want to print the others line we can use finally block
            System.out.println("ER");
        }
        try {
            int[] a= new int[4];
            a[4]=10;
        }catch (Exception r) {
            System.out.println("Exception: "+r);
        }

    }
}
