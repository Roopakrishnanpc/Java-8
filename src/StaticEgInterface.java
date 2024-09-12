interface I1
{
	static void helloWorld()
	{
		System.out.println("Java 8 Feature Hello world in I1, YOU DONT NEED TO CREATE CLASS TO IMPLEMENT THIS METHOD, you dont need class to implement or call the method. Directly call through interface itself Because class takes memory and performance. In interface no static block or constrctor is eeded");
		System.out.println("Java 8 Feature DEFAULT Came because to avoid umimplemented method error in the classes during implements so you can create default ad override in subclass if needed or you can interface method itself ");
	}
}
public class StaticEgInterface{ //implements I1{
public static void main(String[] args) {
//	I1 i=new StaticEgInterface();
//	i.helloWorld();//Error: This static method of interface I1 can only be accessed as I1.helloWorld
//	StaticEgInterface staticeg=new StaticEgInterface();
//	staticeg.helloWorld();//Error: The method helloWorld() is undefined for the type StaticEgInterface
	I1.helloWorld();
}
}
