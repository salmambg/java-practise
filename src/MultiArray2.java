import java.util.stream.Stream;

public class MultiArray2 {
    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println(Stream.of("green", "yellow", "blue")
                .max((s1,s2)-> s1.compareTo(s2))
                .filter(s->s.endsWith("n"))
                .orElse("yellow"));
    }
}
