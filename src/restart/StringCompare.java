package restart;

public class StringCompare {
    public static void main(String[] args) {
        String str1="Apple";
        String str2="Flag";
        String str3="Parrot";
        String str4="Bold";
        String str5="Ant";

        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str1));
        System.out.println(str3.compareTo(str4));
        System.out.println(str4.compareTo(str5));
        System.out.println(str5.compareTo(str1));
    }
}
