package array_demo;

public class ForEachDemo {
    public static void main(String[] args) {

        String[] names= {"Salma","Samiha","Sabiha","momo"};
        int[] numbers ={10,20,30,40,50};
        int sum=0;

        for (String x: names) {
            System.out.println(x);
        }
        for (int r: numbers) {
            sum=sum+r;
        }
        System.out.println(sum);

    }
}
