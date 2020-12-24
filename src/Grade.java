
public class Grade {
    public static void main(String[]args) {
        int grade= -23;
        if(grade>=80 && grade <= 100) {
            System.out.println("A");
        } else if (grade>=70 && grade < 80) {
            System.out.println("B");
        } else if (grade>=60 && grade < 70) {
            System.out.println("C");
        } else if (grade>=50 && grade < 60) {
            System.out.println("D");
        } else if (grade>=40 && grade < 50) {
            System.out.println("E");
        } else if (grade>=33 && grade < 40) {
            System.out.println("G");
        } else if (grade >= 0 && grade < 33) {
            System.out.println("F");
        } else {
            System.out.println("wrong input");
        }
    }
}
