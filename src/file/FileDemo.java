package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dr= new File("File Method");
        dr.mkdir();//directory will be created
        String directoryLocation= dr.getAbsolutePath();
        System.out.println(directoryLocation);
    }
}
