import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter any letter");
        char ch = object.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch=='i' || ch== 'o' || ch== 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
