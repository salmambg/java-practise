package OOP;

public class AddDemo {
    void add (int ...num) {//all value store here as array
        int sum=0;
        for (int x: num) {
            sum=sum+x;
        }
        System.out.println(sum);
    }

}
