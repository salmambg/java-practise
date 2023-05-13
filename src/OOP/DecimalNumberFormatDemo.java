package OOP;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        double x=2.346785;
        System.out.printf("x = %.2f",x);//this is for C++
        System.out.println();
        //in java
        DecimalFormat ob=new DecimalFormat("0.00");
        double y=2.34567;
        System.out.println("y ="+ob.format(y));


    }
}
