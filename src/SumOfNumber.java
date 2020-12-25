
public class SumOfNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 0; number <= 10; number++) {
            sum = sum + number;
            // 1 = 0 + 1
            // 3 = 1 + 2
            // 6 = 3 + 3
        }
        System.out.println(sum);
    }
}
