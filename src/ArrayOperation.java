
public class ArrayOperation {
    public static void main(String args[]) {
        int number[] = new int[3];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;

        System.out.println("array size " + number.length);
//        System.out.println(number[0]);
//        System.out.println(number[1]);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
