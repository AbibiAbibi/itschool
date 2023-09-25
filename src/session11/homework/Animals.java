package session11.homework;

public abstract class Animals {

    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals {

    @Override
    void cats() {
        System.out.println("Cats meow!");
    }

    @Override
    void dogs() {

    }
}

class Dogs extends Animals {

    @Override
    void cats() {

    }

    @Override
    void dogs() {
        System.out.println("Dogs bark!");
    }
}