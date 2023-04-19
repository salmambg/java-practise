package array_demo;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] number= {10,-3,8,5,6};

        Arrays.sort(number);
        System.out.print("Ascending Order: ");
        for (int i=0;i<5;i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.print("Descending Order: ");
        for (int i=4;i>=0;i--) {
            System.out.print(" "+number[i]);
        }
    }
}
