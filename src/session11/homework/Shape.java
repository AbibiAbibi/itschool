package session11.homework;

public abstract class Shape {

    abstract double RectangleArea(double length, double breadth);

    abstract double SquareArea(double side);

    abstract double CircleArea(double radius);
}

class Area extends Shape {

    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    double SquareArea(double side) {
        return side * side;
    }

    @Override
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}