// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract void draw();

    // Regular method with a body
    public void describe() {
        System.out.println("This is a shape.");
    }
}

// Concrete class implementing the abstract class
class Circle extends Shape {
    // Providing implementation of the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Concrete class implementing the abstract class
class Rectangle extends Shape {
    // Providing implementation of the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Main class to demonstrate abstraction
public class AbstractDemo {
    public static void main(String[] args) {
        // Create instances of concrete classes
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call abstract method through instances
        circle.draw();
        rectangle.draw();

        // Call regular method from abstract class
        circle.describe();
        rectangle.describe();
        
        // Checking types of the instances
        if (circle instanceof Circle) {
            System.out.println("circle is an instance of Circle.");
        }
        if (rectangle instanceof Rectangle) {
            System.out.println("rectangle is an instance of Rectangle.");
        }
    }
}
