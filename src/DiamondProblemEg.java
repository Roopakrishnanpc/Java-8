interface Interface1
{
	default void defaultImpEg()//Though overriden we cant default as it is not acess modifer like public, privatre or protected.
	{
		System.out.println("Default interface1 implementation ");
	}
}
interface Interface2 extends Interface1
{

	default void defaultImpEg()//Though overriden we cant default as it is not acess modifer like public, privatre or protected.
	{
		Interface1.super.defaultImpEg();
		System.out.println("Default interface2 implementation ");
	}
}
interface Interface3 extends Interface1
{

	default void defaultImpEg()//Though overriden we cant default as it is not acess modifer like public, privatre or protected.
	{
		Interface1.super.defaultImpEg();
		System.out.println("Default interface3 implementation ");
	}
}
interface Interface4 extends Interface1, Interface2
{
	
}
class Interfaceclass1 implements Interface2,Interface3
{//Duplicate default methods named defaultImpEg with the parameters () and () are inherited from the types Interface3 and Interface2
	
	//when you try to not override the below you can see the above error mentioned whe you write below code it runs this oee which is diamond problem
	//@Override
    public void defaultImpEg()
	{
    	//to fix the diamond problem - Interface2 
    	//comments below two lines and try also comments ths method and see the error as well
    	//Interface1.super.defaultImpEg();
    	Interface2.super.defaultImpEg();
    	Interface3.super.defaultImpEg();
		System.out.println("Class implementation");
	}
}
public class DiamondProblemEg {
public static void main(String[] args) {
	Interfaceclass1 interfaceclass= new Interfaceclass1();
	interfaceclass.defaultImpEg();
    Interface1 interfac = new Interfaceclass1();
    interfac.defaultImpEg();
	
}
}
