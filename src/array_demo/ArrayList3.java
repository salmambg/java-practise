package array_demo;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer>number= new ArrayList<>();
        ArrayList<Integer>number1= new ArrayList<>();
        ArrayList<Integer>number2= new ArrayList<>();

        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number);

        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        System.out.println(number1);

        number2.addAll(number1);
        System.out.println(number2);

        boolean x=number2.equals(number1);
        System.out.println(x);

    }
}
