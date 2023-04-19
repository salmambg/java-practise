package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<>();

        //adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        // System.out.println(number);1 way to print
//        for (int x:number) {
//            System.out.print(x+" ");
//        } 2nd way to print the element
        //third way to print element,,,Iterator
        Iterator itr= number.iterator();
        while (itr.hasNext()) {
            System.out.print(" "+itr.next());
        }
        System.out.println();
        System.out.println("size: "+number.size());

        //removing elements
        number.remove(2);
        System.out.print("Array list contain: "+number);
    }
}
