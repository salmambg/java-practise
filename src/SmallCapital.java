import java.util.Scanner;

public class SmallCapital {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        char ch = object.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("small letter");
        } else if( ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital letter");
        } else{
            System.out.println(" not a letter");
        }
    }
}
