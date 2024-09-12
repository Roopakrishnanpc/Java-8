import java.util.ArrayList;
import java.util.List;

class SuperClass
{
	
}
class A extends SuperClass
{
	int val;
	public List<A> xyz(List ab)
	{
		//List<A> a = new ArrayList<>(ab);
       // a.addAll(ab);
		//System.out.println("Coveriant parent");
		//return "done parent";
		//return a;
		return ab;
		
	}
	public Object xyzU()// -> Object parent, string s the child of object
	{
		//List<A> a=new ArrayList<>();
		System.out.println("Coveriant parent");
		return "done parent";
		//return a;
		
	}
	public SuperClass xyz()// -> Object parent, string s the child of object
	{
		//List<A> a=new ArrayList<>();
		System.out.println("Coveriant parent");
		return new SuperClass();
		//return a;
		
	}
	@Override
	public String toString() {
		return "A [val=" + val + "]";
	}
}
class B extends A
{
	@Override
	public String xyzU()//child of object
	{
		System.out.println("Coveriant child of B");
		return "done";//string returns object
	}
	@Override
    public C xyz() {
        System.out.println("Covariant child of B USING OBJ");
        return new C(); // Return a new instance of B
    }
}
class C extends SuperClass
{
    public void xyz() {
        System.out.println("Covariant child of C");
    }
}
public class CovariantEg {
public static void main(String[] args) {
	List<A> ab=new ArrayList<A>();
    for (int i = 1; i <= 5; i++) { // Example: adding 5 elements
        A a = new A();
        a.val = i; // Set value to i (1, 2, 3, 4, 5)
        ab.add(a);
    }
    A a = new A();
    List<A> result=a.xyz(ab);
    System.out.println(result);//.toString());
    List<A> ab1 = new ArrayList<>();
    ab1.add(new A()); // Adding an instance of A
    ab1.add(new B()); // Adding an instance of B

    // Instantiate class A and use the xyz method
    A a1 = new A();
    List<A> resultList = a1.xyz(ab1);
    System.out.println("Result List: " + resultList);
    a.xyz();

    // Instantiate class B and use the xyz method
    B b = new B();
    String result1 = b.xyzU();
    System.out.println("Result: " + result1);
    
    A abc=new B();
    abc.xyz(); //cals child only
    	SuperClass sup=new A();
    	A aobj=(A) sup;
    	aobj.xyz();
}
}
