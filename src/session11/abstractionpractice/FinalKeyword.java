package session11.abstractionpractice;

public class FinalKeyword {

}

class Parent {
    final void showMessage() {
        System.out.println("Show some message");
    }
}

class Child extends Parent {

    //we can't override
//    void showMessage() {
//
//    }
}
