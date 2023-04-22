package string;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1="This is my country";
        //replace method
        String s2= s1.replace('i','j');
        System.out.println(s2);

        //spilt method
        String[] s3=s1.split(" ");
        for (String x: s3){
            System.out.println(x);
        }
    }
}
