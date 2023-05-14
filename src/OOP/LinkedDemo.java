package OOP;

import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String>Country=new LinkedList<String>();
        Country.add("Germany");
        Country.add("Banglasdesh");
        Country.add("Japan");

        for (int i=0;i<Country.size();i++) {
            System.out.println(Country.get(i));
        }//you can use for each
        //for (String CountryName:Country) {
        //  System.out.println(CountryName);
    }
}
