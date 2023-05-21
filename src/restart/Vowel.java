package restart;

import java.util.ArrayList;

public class Vowel {
    ArrayList<Character>al;
    // constructor for creating and
    // assigning values to the ArrayList al

    Vowel() {
        al=new ArrayList<Character>();
        al.add('A');al.add('a');
        al.add('E');al.add('e');
        al.add('I');al.add('i');
        al.add('O');al.add('o');
        al.add('U');al.add('u');
    }


// a method that checks whether the character c is a vowel or not
    private boolean isVowel(char c) {
        for (int i=0;i<al.size();i++) {
            if (c== al.get(i)) {
                return true;
            }
        }
        return false;
    }
    //a method that calculate the vowels in the String s
    public int countVowels(String s) {
        int countVowel=0;//to store the total number of vowels
        int size=s.length();//size of the String
        for (int i=0;i<size;i++) {
            char c=s.charAt(i);
            if (isVowel(c)) {
                countVowel=countVowel+1;
            }
        }
        return countVowel;
    }
}
