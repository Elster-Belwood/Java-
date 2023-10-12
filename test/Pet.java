package test;

public class Pet{
    private String name;
    private int id;
    private int health;
    private int love;

    public Pet(){}
    public Pet(String name, int id, int health, int love) {
        this.name = name;
        this.id = id;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getLove() {
        return love;
    }
    public void setLove(int love) {
        this.love = love;
    }
    //函数
    public void eat(){
        System.out.println(getName()+" is eating.");
    }
    public void play(){
        System.out.println(getName()+" is playing with you.");
    }
 }
