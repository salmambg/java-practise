package inheritance;

public class Lion extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void DisplayInfo() {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Color: "+getColor());
    }
}
