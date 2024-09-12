class ExampleClass {

    // Static variable
    static int staticCount = 100;

    // Instance variable
    int instanceCount = 0;

    // Static nested class
    static class StaticNestedClass {
    	int a=19;
    	
        void display() {
        	//staticCount=130;
        	ExampleClass.staticCount=130;
            System.out.println("Inside Static Nested Class");
            // Static nested class can access static variables and methods of the outer class
            System.out.println("Static count from Static Nested Class: " + staticCount);
        	System.out.println("Static count from Static Nested Class: a: " + a);
        }
    }

    // Non-static nested class (Inner class)
    class NonStaticNestedClass {
        void display() {
            System.out.println("Inside Non-Static Nested Class");
            // Non-static nested class can access both static and instance variables and methods of the outer class
            System.out.println("Instance count from Non-Static Nested Class: " + instanceCount);
            System.out.println("Static count from Non-Static Nested Class: " + staticCount);
        }
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method called. Static count: " + staticCount);
    }

    // Instance method
    void instanceMethod() {
    	instanceCount=5;
        System.out.println("Instance method called. Instance count: " + instanceCount);
    }

    // Static block for initialization
    static {
        staticCount = 10; // Initialize static variable
        System.out.println("Static block initialized. Static count: " + staticCount);
        
    }
    public static final double PI = 3.14159;

    // Static method
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    // Static method
    public static double calculateCircleCircumference(double radius) {
        return 2 * PI * radius;
    }

}

public class StaticEg {

    public static void main(String[] args) {
        // Accessing the static nested class
        ExampleClass.StaticNestedClass staticNested = new ExampleClass.StaticNestedClass();
        staticNested.display(); // Output: Inside Static Nested Class - 10
        
        // Accessing the non-static nested class
        ExampleClass outer = new ExampleClass();
        ExampleClass.NonStaticNestedClass nonStaticNested = outer.new NonStaticNestedClass();
        nonStaticNested.display(); // Output: Inside Non-Static Nested Class - 0

        // Call static method directly using class name
        ExampleClass.staticMethod(); // Output: Static method called. Static count: 10 using static block, if inside method you give some value it changes so 130

        // Create an instance of ExampleClass
        ExampleClass example = new ExampleClass();
        //example.instanceCount = 5;
        example.instanceMethod(); // Output: Instance method called. Instance count: 5 using above or direct inside method

        // Modify static variable via instance
       // example.staticCount = 20;
        ExampleClass.staticCount=20;
        // Call static method again
        ExampleClass.staticMethod(); // Output: Static method called. Static count: 20
        
        double radius = 5.0;
        double area = ExampleClass.calculateCircleArea(radius);
        double circumference = ExampleClass.calculateCircleCircumference(radius);

        System.out.println("Area of circle with radius " + radius + ": " + area);
        System.out.println("Circumference of circle with radius " + radius + ": " + circumference);
        // Output:
        // Area of circle with radius 5.0: 78.53975
        // Circumference of circle with radius 5.0: 31.4159

    }

}
