package restart;

public class VowelTest {
    public static void main(String[] args) {
        Vowel obj=new Vowel();
        String str= "Java t point is a great learning site for java";
        int noOfVowel= obj.countVowels(str);

        System.out.println("String: "+str);
        System.out.println("Total number of vowels in this strings are: "+noOfVowel+"\n");
        str="An apple ona  a day keeps a doctor away";
        System.out.println("String: "+str);

        noOfVowel=obj.countVowels(str);
        System.out.println("Total number of vowels in this strings are: "+noOfVowel+"\n");
    }
}
