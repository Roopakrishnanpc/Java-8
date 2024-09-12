import java.util.Comparator;
import java.util.function.BiConsumer;
//@FunctionalInterface
interface Calculator {
	int age=10;
    // Abstract method (functional method)
    int calculate(int a, int b);
   // int calculated(int a, int b);//cannot create two abstract
    // Default method
    default int add(int a, int b) {
        return a + b;
    }
    default int sub(int a, int b) {
        return a - b;
    }
    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }
    

    // Default method (without implementation) - Incorrect
    //default void defaultMethod(); // Compilation error

    // Static method (without implementation) - Incorrect
    //static void staticMethod(); // Compilation error

    // Static method without implementation (Incorrect)
    //static int staticMethodWithReturn(); // Compilation error
}
//class CalculatorImpl implements Calculator {
//    @Override
//    public int calculate(int a, int b) {
//        // Implementation of the abstract method
//        return a - b; // Example: subtraction
//    }}

public class Java8Faeatures {//implements Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiConsumer<Integer, Integer> biConsumer =(a,b) -> System.out.println(a+b);
biConsumer.accept(1,4);
System.out.println("The age constant from Calculator interface are static and final by default variables: " + Calculator.age);
Calculator calculator=(a,b) -> {System.out.println(a-b); return a-b;};
//(Integer a,Integer b) -> System.out.println(a+b);//Syntax error, insert "AssignmentOperator Expression" to complete Expression so biconsumer was used
//Calculator calculator = new CalculatorImpl();
//Calculator calculator=new Java8Faeatures();
// Use the abstract method
System.out.println("Calculation (a - b): " + calculator.calculate(10, 5));
//functional interface must only have one abstract method and n no of defaults and static methods
// Use the default method from the interface
System.out.println("Addition (a + b): " + calculator.add(10, 5));
System.out.println("Subtraction (a - b): " + calculator.sub(10, 5));
// Use the static method from the interface
System.out.println("Multiplication (a * b): " + Calculator.multiply(10, 5));
System.out.println(calculator.calculate(10, 5));
Comparator<Integer> e=(s1,s2)-> s1.compareTo(s2);
System.out.println(e.compare(10, 12));//-1. 10 <12
System.out.println(e.compare(104, 12));//1. 104<12
System.out.println(e.compare(102, 102));//102==102
	}
//you can override when you use implements Calculator but we used functional interface
//	@Override
//	public int calculate(int a, int b) {
//		// TODO Auto-generated method stub
//		return a*b;
//	}
}


