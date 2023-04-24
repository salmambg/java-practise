package restart;

public class WrapperDemo {
    public static void main(String[] args) {
        // primitive to object

        int x=30;
        Integer y= Integer.valueOf(x);
        System.out.println(y);

        //object to primitive data type

        Double d =  new Double("39.45");;
        double e =d.doubleValue();
        System.out.println(e);

    }
}
