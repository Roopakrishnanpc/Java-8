import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employerr {
    private int id;
    private String name;

    // Constructor
    public Employerr(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employerr{id=" + id + ", name='" + name + "'}";
    }
    
}

public class StreamEg {

    public static void main(String[] args) {
        // Creating a list of Employerr objects
        List<Employerr> emp = new ArrayList<>();
        emp.add(new Employerr(1, "Roopa"));
        emp.add(new Employerr(2, "John"));
        emp.add(new Employerr(3, "Roopa"));
        Stream<Employerr> openStream=emp.stream();
        Stream<Employerr> filteredStream= openStream.filter(x -> x.getId()==1);
        List<Employerr> newList=filteredStream.collect(Collectors.toList());
        newList.stream().forEach(x-> System.out.println(x));
        // Filtering and printing the employees with name "Roopa"
        emp.stream()
           .filter(x -> "Roopa".equals(x.getName()))
           .collect(Collectors.toList())
           .forEach(x -> System.out.println(x));
        emp.stream()
        .map(x -> x.getName().equals("Roopa") ? x.getName() + " Sri" : x.getName())
        .collect(Collectors.toList())
        .forEach(x -> System.out.println(x));
		System.out.println("WithoutStream");
		
		Map<Integer, Employerr> idToEmployerrMap = emp.stream()
	            .filter(x -> x.getId() == 1)
	            .collect(Collectors.toMap(
	                Employerr::getId,       // Key mapper: using ID as key
	                e -> e                  // Value mapper: the Employerr instance itself
	            ));

	        // Printing the map
	        idToEmployerrMap.forEach((id, employerr) -> 
	            System.out.println("ID: " + id + ", Employerr: " + employerr));
		List<Integer> initialList=new ArrayList<>();
		initialList.add(10);
		initialList.add(10);
		initialList.add(20);
		initialList.add(40);
		List<Integer> printList=findAllElements(initialList);

		for(Integer i:printList)
		{
			System.out.println(i);
		}
		System.out.println("WithStream");
		printList=initialList.stream().filter(x->x>=15).collect(Collectors.toList());
		printList.stream().forEach(x-> System.out.println("Using Stream Basic filter create collectors.tolist "+x));
		
		Stream s=initialList.stream().filter(x->x%2==0);
		s.forEach(x-> System.out.println("Using Stream another filter eg Stream "+x));
		
		initialList.stream().filter(x->x%2==0).forEach(x-> System.out.println("Using Stream another filter eg oe line "+x));
		
		printList=initialList.stream().map(x->x*15).collect(Collectors.toList());
		printList.stream().forEach(x-> System.out.println("Using Stream Basic map create collectors.tolist "+x));
		
		
		Stream s1=initialList.stream().map(x-> x*x);
		s1.forEach(x->System.out.println("Using map two lines map and Stream "+x));
		initialList.stream().map(x-> x*x).forEach(x->System.out.println("Using map single line "+x));
		Stream<Integer> filterstreamSort= initialList.stream()
		           .filter(x ->x>=20);//.sorted();
	      Stream<Integer> streamSort=filterstreamSort.sorted();
	      streamSort.forEach(x -> System.out.println(x));
	      
	      Stream.of(1,234,432,4,54).forEach(xx-> System.out.println(xx));
	     String[] name={"ty","hj","ghj","j"};
	     Stream.of(name).filter(x-> x.length()>2).forEach(xx-> System.out.println(xx));
	     
	     Stream<Integer> stream = Stream.of(10, 10, 20, 40);

	        // Use stream operations to filter and print integers >= 20
	        stream.filter(x -> x >= 20)  // Filter elements greater than or equal to 20
	              .forEach(System.out::println);  // Print each element
    }
	public static List<Integer> findAllElements(List<Integer> abc)
	{
		List<Integer> newList = new ArrayList<>();
		for(Integer i:abc)
		{
			if(i>=15)
			{
				newList.add(i);
			}
		}
		return newList;
	}
}
