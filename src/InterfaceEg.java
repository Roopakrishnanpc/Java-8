

interface InferfaceDemo
{
	void oneAbstractMethodFunctional();
	default void defaultImp1()//default came i Java 1.8
	{
		System.out.println("Default iterface implementation");
	}
	default void defaultImp2()//basically default is dummy representatio, eve if menthods are not overriden it will use this implementation itself as above to void unimplemented methods error
	{
		System.out.println("Default iterface implementation 2");
	}
//	default int hashCode() -> A default method cannot override a method from java.lang.Object 
//	{
//		return 2*3;
//	}
//
	}

class FirstIterface implements InferfaceDemo
{

	@Override
	public void oneAbstractMethodFunctional() {
		// TODO Auto-generated method stub
		System.out.println("FirstInterface");
	}
	@Override
	public void defaultImp2()//Though overriden we cant default as it is not acess modifer like public, privatre or protected.
	{
		System.out.println("Default class implementation 2 overriden ");
	}
	
}
class SecodIterface implements InferfaceDemo
{

	@Override
	public void oneAbstractMethodFunctional() {
		// TODO Auto-generated method stub
		System.out.println("SecondInterface");
	}
	@Override
	public void defaultImp2()//Though overriden we cant default as it is not acess modifer like public, privatre or protected.
	{
		System.out.println("Default class implementation 3 overriden ");
	}
}
public class InterfaceEg {
public static void main(String[] args) {
	InferfaceDemo iterface1=new FirstIterface();
	iterface1.oneAbstractMethodFunctional();
	iterface1.defaultImp1();
	iterface1.defaultImp2();
	InferfaceDemo iterface2=new SecodIterface();
	iterface2.oneAbstractMethodFunctional();
	

}
}
