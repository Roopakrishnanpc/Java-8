public class SingletonDemo {

    // Singleton Class Implementation
    public static class Singleton {
        // Private constructor to prevent instantiation
        private Singleton() {
            // Initialization code here
        }

        // Static inner class responsible for holding the Singleton instance
        private static class SingletonHelper {
            // The static final instance of Singleton, initialized only once
            private static final Singleton INSTANCE = new Singleton();
        }

        // Public method to provide access to the Singleton instance
        public static Singleton getInstance() {
            return SingletonHelper.INSTANCE;
        }

        // Sample method for demonstration
        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }
    }

    // Main method to demonstrate Singleton usage
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Display messages
        singleton1.showMessage();
        singleton2.showMessage();

        // Check if both references point to the same instance
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances.");
        }
    }
}


	


