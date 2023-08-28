package session10.animal_problem;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating plants.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating seeds.");
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating plankton.");
    }
}