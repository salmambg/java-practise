
public class Problem1 {

    private static int checkDigit(String memberId) {
        int sum = 0;
        for (int i = 0; i < memberId.length(); i++) {
            int number = Integer.parseInt(String.valueOf(memberId.charAt(i)));
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {

        String memberId = "55555";
        int sum = checkDigit(memberId);
        if (sum > 10) {
            memberId = String.valueOf(sum);
            sum = checkDigit(memberId);
        }
        System.out.println(sum);
    }
}
