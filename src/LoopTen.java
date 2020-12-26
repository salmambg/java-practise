
public class LoopTen {
    public static void main(String[] args) {
        for (int number = 60; number <= 90; number++) {
            if (number == 70 && number ==80) {
                continue;
            }
            System.out.println(number);
        }
    }
}
