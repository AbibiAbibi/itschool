package session10.homework.animals;

public class Animal {

    public void sound() {
        System.out.println("Animal makes sounds!");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

class Wolf extends Animal {

    @Override
    public void sound() {
        System.out.println("How!");
    }
}