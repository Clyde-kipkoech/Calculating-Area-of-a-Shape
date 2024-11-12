public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);  // Circle with radius 5.0
        Shape rectangle = new Rectangle(4.0, 6.0);  // Rectangle with length 4.0 and width 6.0

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

