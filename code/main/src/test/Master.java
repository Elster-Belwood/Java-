package test;

import java.util.concurrent.Callable;

public class Master {
    public void feed(Pet pet){
        pet.eat();
    }
    public void play(Pet pet){
        pet.play();
    }

    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog();
        dog.setName("Wolf");
        Cat cat = new Cat();
        cat.setName("Kitty");
        master.feed(dog);
        master.feed(cat);
        master.play(dog);
        master.play(cat);
    }
}
