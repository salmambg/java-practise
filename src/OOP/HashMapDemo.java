package OOP;

import java.beans.Customizer;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>customer= new HashMap<Integer,String>(); //put and get method
        customer.put(101,"Salma");//key and value
        customer.put(102,"Samiha");
        customer.put(103,"Sabiha");

        System.out.println(customer.get(102));

    }


}
