package test;

public class Cat extends Pet{
    private String color;
    private int number;
    private String type;

    public Cat() {}
    public Cat(String color, int number, String type) {
        this.color = color;
        this.number = number;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void eat(){
        System.out.println(getName()+" is eating fish");
    }
    public void play(){
        System.out.println(getName()+" is playing with toy-mouse.");
    }
}
