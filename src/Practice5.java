
public class Practice5 {
    public static void main(String[] args) {
        for (int number = 10; number <= 100; number++) {
            if(number % 10 == 0 && number % 2 == 0){
                System.out.println( number + " multipilcation of 10 ");
            } else if (number % 5 == 0 && number % 2 != 0){
                System.out.println(number + " multiplication of 5 ");
            } else{
                System.out.println(number);
            }
        }
    }
}
