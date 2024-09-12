import java.util.function.Predicate;

public class PredecateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predcate= s -> s.length() >=5;// boolean return trye or false
		//write code once using 100 times
		System.out.println(predcate.test("Predicate example"));
		System.out.println(predcate.test("Predicate example first"));
		System.out.println(predcate.test("Predicate example second"));
		System.out.println(predcate.test("Predicate example third"));
		System.out.println(predcate.test("Predicate example fourth"));
		Predicate<String> predcateeven= s -> s.length() %2==0;// boolean return trye or false
		//write code once using 100 times
		System.out.println(predcateeven.test("Predicate example"));
		System.out.println(predcate.and(predcateeven).test("Predicate example"));
		System.out.println(predcate.or(predcateeven).test("Predicate example"));
		System.out.println(predcate.negate().test("Predicate example negate works with only one predecate"));
	}

}
