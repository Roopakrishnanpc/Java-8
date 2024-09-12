// Public and final top-level class
public final class FinalEClass {
    private String message;

    // Constructor
    public FinalEClass(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message from FinalClass: " + message);
    }

    public static void main(String[] args) {
        // Create an instance of the FinalClass
        FinalEClass instance = new FinalEClass("Hello, World!");
        instance.displayMessage();
    }
    //In Java, the static keyword cannot be applied to top-level (or normal) classes. The static keyword is reserved for nested classes and static members within a class.
}
