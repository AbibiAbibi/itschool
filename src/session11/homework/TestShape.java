package session11.homework;

public class TestShape {

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        double rectangleArea = areaCalculator.RectangleArea(5.0, 7.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        double squareArea = areaCalculator.SquareArea(4.0);
        System.out.println("Area of the square: " + squareArea);

        double circleArea = areaCalculator.CircleArea(3.0);
        System.out.println("Area of the circle: " + circleArea);
    }
}