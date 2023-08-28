package session10.animal_problem;

public class AnimalHierarchy {

    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog");
        Bird sparrow = new Bird("Sparrow");
        Fish salmon = new Fish("Salmon");

        dog.eat();
        sparrow.eat();
        salmon.eat();
    }
}