package session11.practice.abstractionpractice;


public abstract class shape {

    private String name = "some shape name";
    abstract double area();

    abstract double perimeter();

    String getShapeName() {
        return "shape";
    }
}

class Circle extends shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return Math.PI * radius;
    }


}

class Rectangle extends shape {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return (length * 2) + (width * 2);
    }
}