package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("Salma");
        System.out.println(str);

        str.append("Akter");
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(0,5);
        System.out.println(str);
    }
}
