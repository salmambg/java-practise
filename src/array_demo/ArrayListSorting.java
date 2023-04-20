package array_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();

        number.add(32);
        number.add(-3);
        number.add(23);
        number.add(10);
        number.add(-6);
        number.add(2);
        System.out.println("Before Sorting: "+number);

        Collections.sort(number);
        System.out.println("After sorting: "+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting descending: "+number);

    }
}
