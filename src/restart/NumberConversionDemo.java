package restart;

public class NumberConversionDemo {
    public static void main(String[] args) {

        //Binary to decimal
        String binary ="1010";
        Integer dec= Integer.parseInt(binary,2);
        System.out.println(dec);

        // Octal to decimal
        String octal= "345";
        Integer dec1=Integer.parseInt(octal,8);
        System.out.println(dec1);

        //hexadecimal to decimal
        String hexadecimal="B";
        Integer dec2=Integer.parseInt(hexadecimal,16);
        System.out.println(dec2);
    }
}
