// Final Class Example
final class FinalClass {
    // Final Variable
    final int finalVariable = 10;

    // Final Method
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }

    // Final method cannot be overridden in a subclass
    // Uncommenting the following line would cause a compile-time error
    // public void displayMessage() {
    //     System.out.println("Attempt to override final method.");
    // }
}

// Attempt to extend the final class will result in a compile-time error
// Uncommenting the following code would cause a compile-time error
// class SubClass extends FinalClass {
//     // Attempting to override the final method would also cause a compile-time error
//     // public void displayMessage() {
//     //     System.out.println("Trying to override final method.");
//     // }
// }
class FinalEG
{
    public static final int STATIC_FINAL_VARIABLE = 100;

    // Static Method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    public static int staticMethod(int a) {
        System.out.println("This is a static method.");
        return 6;
    }
	final int abc=17;
    public final void displayMessage() {
        System.out.println("This is a final method in non final class.");
    }
}
public class FinalExample {
    public static void main(String[] args) {
        // Create an instance of the final class
        FinalClass fc = new FinalClass();
        
        // Print the final variable
        System.out.println("Final Variable: " + fc.finalVariable);
        
        // Call the final method
        fc.displayMessage();

        // Attempt to change the final variable will result in a compile-time error
        // Uncommenting the following line would cause a compile-time error
        // fc.finalVariable = 20; // Cannot assign a value to final variable finalVariable
        FinalEG eg=new FinalEG();
        System.out.println(eg.abc);
        eg.displayMessage();
        System.out.println(FinalEG.STATIC_FINAL_VARIABLE);
        FinalEG.staticMethod();
        int a=FinalEG.staticMethod(7);
        System.out.println(a);
    }
}
