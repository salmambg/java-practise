package string;

public class StringDemo3 {
    public static void main(String[] args) {

        String country = "Bangladesh is my country";
        System.out.println(country);

        char ch=country.charAt(0);//0 is the index number
        System.out.println("ch= "+ch);

        int value=country.codePointAt(0);
        System.out.println("value: "+value);

        int pos= country.indexOf('y');
        System.out.println("the index of y is: "+pos);

        int ind= country.lastIndexOf("y");
        System.out.println("the last index pof y is: "+ind);
    }
}
