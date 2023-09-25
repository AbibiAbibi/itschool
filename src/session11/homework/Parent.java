package session11.homework;

public abstract class Parent {

    abstract void message();
}

class FirstSubclass extends Parent {

    void message() {
        System.out.println("This is first subclass!");
    }
}

class SecondSubclass extends Parent {

    void message() {
        System.out.println("This is second subclass!");
    }
}