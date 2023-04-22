package string;

public class StringDemo5 {
    public static void main(String[] args) {
        //difference between string and string buffer is in string if you have to change something you have to declare a new variable,cannot change in original,but in string buffer its is possible to change in main variable.
        //in here you can change the main object
        StringBuffer sb= new StringBuffer("Salma Akter");
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);

        sb.append(" Hossain");
        sb.append(" "+27);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.setLength(6);
        System.out.println(sb);
    }
}
