package restart;

public class numberConversionDemo2 {
    public static void main(String[] args) {

  //convert decimal into binary,octal, hexadecimal.

        int dec= 15;
        String binary=Integer.toBinaryString(dec);
        System.out.println(binary);

        int dec1=34;
        String octal=Integer.toOctalString(dec1);
        System.out.println(octal);

        int dec2=15;
        String hexadecimal=Integer.toHexString(dec2);
        System.out.println(hexadecimal);
    }
}
