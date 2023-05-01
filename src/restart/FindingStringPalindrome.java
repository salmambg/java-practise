package restart;

import java.util.Scanner;

public class FindingStringPalindrome {
    public static void main(String[] args) {
        String result= firstPalindrome(new String[]{"car","asa","baby","madam"});
        System.out.println(result);
    }
    public static String firstPalindrome(String[]words) {
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<words.length;i++) {
            sb.append(words[i]);
            sb.reverse();
            if (words[i].equals(sb.toString())) {
                return words[i];
            }
            sb.delete(0,sb.length());

        }
        return " ";
    }
}
