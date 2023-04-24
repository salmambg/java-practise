package restart;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {

        Random rand= new Random();
        int randomNumber= rand.nextInt(10); //It will generate any number from 0 to 9 in every run
        System.out.println(randomNumber);

    }
}
