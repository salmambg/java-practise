package OOP;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>fruitName=new HashSet<String>(); //there can not be a duplicate value like array list
        fruitName.add("Mango");
        fruitName.add("Orange");
        fruitName.add("Berry");

        System.out.println(fruitName.size());

        System.out.println(fruitName);
    }
}
