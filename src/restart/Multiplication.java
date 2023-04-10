package restart;

public class Multiplication {
    public static void main(String[] args) {
        int i=0, r=0;
        for (i=1; i<=10; i++) {
            r = i*5;
            if (r%2!=0) {
                System.out.println("5*" + i + "=" +r);
            }
        }
    }
}
