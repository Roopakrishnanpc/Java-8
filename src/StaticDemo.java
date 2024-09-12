public class StaticDemo {

    // Static variable
    private static int staticVariable;

    // Static block for initialization
    static {
        System.out.println("Static block 1: Initializing static variables.");
        staticVariable = 10;
    }

    // Another static block
    static {
        System.out.println("Static block 2: Additional setup.");
        // You can add more initialization code here if needed
    }

    // Constructor
    public StaticDemo() {
        System.out.println("Constructor: Creating instance of StaticDemo.");
    }

    // Static method
    public static void displayStaticVariable() {
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        
        // Accessing static method
        StaticDemo.displayStaticVariable();
        
        // Creating instance of StaticDemo to see constructor behavior
        StaticDemo instance = new StaticDemo();
        
        System.out.println("Main method ended.");
    }
}
