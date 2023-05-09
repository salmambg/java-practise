package abstraction;

public abstract class MobileUser {
    void call() {
        System.out.println("I am call method");//non-abstract method
    }
    abstract void sendMessage();//abstract method
}
