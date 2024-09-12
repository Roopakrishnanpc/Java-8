
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateFunctionConsumerDemo {
    public static void main(String[] args) {
        // BiPredicate takes two inputs and returns a boolean result.
        BiPredicate<String, Integer> biPredicate = (s, i) -> {
            // This predicate checks if the length of the string multiplied by the integer is greater than 10
            if (i == null) {
                return false; // Handle null input for integer to avoid NullPointerException
            }
            return s.length() * i > 10;
        };

        // Testing the BiPredicate
        System.out.println(biPredicate.test("Hello", 3)); // Output: true (5 * 3 = 15, which is > 10)
        System.out.println(biPredicate.test("Hey", 4)); // Output: true (3 * 4 = 12, which is > 10)
        System.out.println(biPredicate.test("Hi", 4));// Output: faLSE (2 * 4 = 8, which is > 10)
        System.out.println(biPredicate.test("Hello", null)); // Output: false (because `i` is null)

        // BiFunction takes two inputs and returns a result.
        BiFunction<String, Integer, String> biFunction = (s, i) -> {
            // This function returns a string combining the input string and the product of its length and the integer
            if (i == null) {
                return "Invalid input"; // Handle null input for integer
            }
            return s + " has length " + s.length() + " and multiplied value is " + (s.length() * i);
        };

        // Testing the BiFunction
        System.out.println(biFunction.apply("Hello", 3)); // Output: "Hello has length 5 and multiplied value is 15"
        System.out.println(biFunction.apply("Hey", 4));   // Output: "Hey has length 3 and multiplied value is 12"
        System.out.println(biFunction.apply("Hello", null)); // Output: "Invalid input" (because `i` is null)

        // BiConsumer takes two inputs and performs an action (no return value).
        BiConsumer<String, Integer> biConsumer = (s, i) -> {
            if (i == null) {
                System.out.println("Invalid input"); // Handle null input for integer
                return;
            }
            System.out.println(s.length() * i); // Prints the product of the string's length and the integer
        };

        // Testing the BiConsumer
        biConsumer.accept("hey", 10); // Output: 30 (3 * 10)
        biConsumer.accept("hello", 5); // Output: 25 (5 * 5)
        biConsumer.accept("test", null); // Output: "Invalid input" (because `i` is null)
    }                                                                   
}
