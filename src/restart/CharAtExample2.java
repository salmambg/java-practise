package restart;

public class CharAtExample2 {
    public static void main(String[] args) {
        String str="Welcome to the java portal";
        int l= str.length();
        System.out.println(l);
        for (int i=0;i<=str.length()-1;i++) {
            if (i%2!=0) {
                System.out.println("Charat"+" "+i+" "+ "place"+" "+str.charAt(i));
            }
        }
        //how to find out frequency
        int count=0;
        for (int i=0; i<=str.length()-1;i++) {
            if(str.charAt(i)=='t') {
                count++;
            }
        }
        System.out.println("Frequency of t is: "+count);

    }
}
