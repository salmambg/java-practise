package OOP;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> Country=new LinkedList<String>();
        Country.add("Germany");
        Country.add("Banglasdesh");
        Country.add("Japan");
        Country.addLast("Denmark");
        Country.addFirst("Brazil");
        Country.remove(3);
        for (String CountyName:Country) {
            System.out.println(CountyName);
        }

        System.out.println("Size of the LinkedList: "+Country.size());
    }
}
