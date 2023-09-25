package session11.homework;

public abstract class AbstractClass {

    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void aMethod();

    void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    void aMethod() {
        System.out.println("This is abstract method");
    }
}