import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Function<T, R> T-input and R is return type
		Function<Integer, Integer> fuc= (s) -> s*s;// boolean return trye or false
		//write code once using 100 times
		System.out.println(fuc.apply(80));
		Function<Integer, Integer> func= (s) -> s*3;
		System.out.println(func.apply(80));
		//100*100*3 first fuc then func
		System.out.println(fuc.andThen(func).apply(100));
		//90*3 then 270*270 first func then fuc
		System.out.println(fuc.compose(func).apply(90));
		Function<String, Integer> fuc1= (s) -> s.length() /3;// boolean return trye or false
		//write code once using 100 times
//        for (int i = 0; i < 100; i++) {
//            System.out.println(fuc1.apply("Hello hey"));
//        }
		System.out.println(fuc1.apply("Hello hey"));
	//below two lies wont work
		//Function<Integer, Integer> combinedFunction = fuc.andThen(fuc1);
		//fuc.andThen(fuc1).apply(Integer.parseInt("Hello"));
		// Correct chaining using `andThen` requires compatible types:
	        // For example, first convert Integer to String and then get the length modulo 2
		//fuc1.compose(fuc1.andthe(s -> s*2) -> output is 1 so 1*2=2
		
//		Intermediate Function (fuc1.andThen(s -> s * 2)):
//
//			fuc1: For the input string "Hello", fuc1("Hello") computes:
//			Length of "Hello" is 5.
//			5 / 3 is 1 (integer division).
//			s -> s * 2: Multiplies the result of fuc1 (which is 1) by 2.
//			1 * 2 is 2.
//			Function Composition (fuc.compose(...)):
//
//			fuc: Squares its integer input.
//
//			fuc.compose(fuc1.andThen(s -> s * 2)): This means:
//
//			Apply fuc1.andThen(s -> s * 2) to the input string.
//			Then apply fuc to the result of the intermediate function.
//			For the input "Hello":
//
//			First, apply fuc1.andThen(s -> s * 2):
//			fuc1("Hello") results in 1.
//			Applying s -> s * 2 to 1 results in 2.
//			Next, apply fuc to the result 2:
//			fuc(2) computes 2 * 2 = 4.
		Function<String, Integer> combinedFunction2 = fuc.compose(fuc1.andThen(s -> s * 2));
		//System.out.println(fuc.compose(fuc1.andThen(s -> s * 2)););
        // Here fuc1 outputs Integer which is compatible with fuc input
        System.out.println(combinedFunction2.apply("Hello")); // This will work correctly

        // Another valid `compose` example:
        // Function to append " World" to a string
        Function<String, String> appendStringFunction = (s) -> s + " World";
        // Chain fuc1 to appendStringFunction, ensuring compatible types
        Function<String, Integer> combinedFunction3 = fuc1.compose(appendStringFunction);
        System.out.println(combinedFunction3.apply("Hello Hey")); // Append " World" to "Hello" and then apply fuc1
        BiFunction<String, Integer, Integer> bifuc = (s, i) -> s == null ? 0 : s.length() * i;

        // Use the BiFunction with a String and an Integer
        for (int j = 0; j < 100; j++) {
            // Here we use null for the String and any integer value, e.g., 5
            System.out.println(bifuc.apply("hello", 5));
        }
	}
	
}
