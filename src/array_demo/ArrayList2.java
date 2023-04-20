package array_demo;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> number= new ArrayList<>();

        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.print(number);
        System.out.println();

        number.set(2,50);
        System.out.println(number);

        int x= number.get(0);
        System.out.println(x);
    }
}
