package string;

public class StringDemo6 {
    public static void main(String[] args) {
        int i=10;
        String s= Integer.toString(i);
        System.out.println(s);

        boolean b=true;
        String s1= Boolean.toString(b);
        System.out.println(s1);

        //string to primitive
        String d="3";
        int f= Integer.parseInt(d);
        System.out.println(f);
    }
}
