package string;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1="Salma Akter";
        String s2=new String("Salma Akter");

        char[] s3={'w','e','d','t'};
        System.out.println(s3);

        int len=s1.length();
        System.out.println(len);

        if (s1==s2){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
            //does not print equals because it compares between objects which are not same;not compare values

        } // for value comparing
        if (s1.equals(s2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
        boolean b= s1.isEmpty();
        System.out.println(b);
    }
}
