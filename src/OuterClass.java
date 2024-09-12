public class OuterClass {

    // Static nested class
    public static class StaticNestedClass {
        private static String staticNestedMessage = "Hello from StaticNestedClass";

        public void showMessage() {
            System.out.println(staticNestedMessage);
        }
    }

    // Final class
    public final class FinalClass {
        private String finalMessage = "Hello from FinalClass";

        public void showMessage() {
            System.out.println(finalMessage);
        }
    }

    // Method to demonstrate usage of static nested class and final class
    public void demonstrate() {
        // Creating an instance of the static nested class
        StaticNestedClass nestedInstance = new StaticNestedClass();
        nestedInstance.showMessage();
        
        // Creating an instance of the final class
        FinalClass finalInstance = new FinalClass();
        finalInstance.showMessage();
    }

    public static void main(String[] args) {
        // Demonstrate static nested class and final class
        OuterClass outer = new OuterClass();
        outer.demonstrate();
        
        // Creating an instance of the static nested class without an instance of OuterClass
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.showMessage();
        StaticNestedClass s=new StaticNestedClass();
        s.showMessage();
       
       // StaticNestedClass.staticNestedMessage(); //error
        //FinalClass finalInstance = new FinalClass(); //No enclosing instance of type OuterClass is accessible. Must qualify the allocation with an enclosing instance of type OuterClass (e.g. x.new A() where x is an instance of OuterClass).
        
    }
}
