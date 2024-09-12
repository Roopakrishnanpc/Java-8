interface Functioanl {
	int age=10;
    // Abstract method (functional method)
    int calculate(int a, int b);
}
class Test
{
    public static int instanceCalculate(int a, int b) {
        return a + b; // Example implementation
    }
}
public class MethodRefereceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Functioanl functioanl=(a,b) -> {System.out.println(a-b); return a-b;};
//		functioanl.calculate(10, 20);
		//this is method referencing	
		Functioanl functioanlTest=Test :: instanceCalculate;
		functioanlTest.calculate(10, 1090);
	}

}
