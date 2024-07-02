package _0708_crawl_deep;

abstract class Animal {
    public abstract void speak();
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow Meow!");
    }
}

public class deep_q2_casting {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}