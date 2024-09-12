
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployerrStream implements Comparable<EmployerrStream>{
    private int id;
    private String name;

    // Constructor
    public EmployerrStream(int id, String name) {
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
        return "EmployerrStream{id=" + id + ", name='" + name + "'}";
    }

	@Override
	public int compareTo(EmployerrStream o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
    
}

public class StreamProcessEg {

    public static void main(String[] args) {
        // Creating a list of EmployerrStream objects
        List<EmployerrStream> emp = new ArrayList<>();
        emp.add(new EmployerrStream(1, "Roopa"));
        emp.add(new EmployerrStream(2, "John"));
        emp.add(new EmployerrStream(3, "Roopa"));
        Stream<EmployerrStream> openStream=emp.stream();
        Stream<EmployerrStream> filteredStream= openStream.filter(x -> x.getId()==1);
        List<EmployerrStream> newList=filteredStream.collect(Collectors.toList());
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
		
		Map<Integer, EmployerrStream> idToEmployerrStreamMap = emp.stream()
	            .filter(x -> x.getId() == 1)
	            .collect(Collectors.toMap(
	                EmployerrStream::getId,       // Key mapper: using ID as key
	                e -> e                  // Value mapper: the EmployerrStream instance itself
	            ));

	        // Printing the map
	        idToEmployerrStreamMap.forEach((id, EmployerrStream) -> 
	            System.out.println("ID: " + id + ", EmployerrStream: " + EmployerrStream));
	       Stream<EmployerrStream> streamCount= emp.stream()
	           .filter(x -> "Roopa".equals(x.getName()));
	           Long streamCountUsingCount=streamCount.count();
	           System.out.println(streamCountUsingCount);
//		       Stream<EmployerrStream> filterstreamSort= emp.stream()
//			           .filter(x -> "Roopa".equals(x.getName()));//.sorted();
//		      Stream<EmployerrStream> streamSort=filterstreamSort.sorted();
//		      streamSort.forEach(x -> System.out.println(x));
	           System.out.println("Sorting in ascending order by ID:");
		      emp.stream()
	           .filter(x -> "Roopa".equals(x.getName()))
	           .sorted(Comparator.comparing(EmployerrStream::getId)) // Sorting by ID
	           .forEach(System.out::println); // Print each element
		        System.out.println("Sorting in descending order by ID:");
		      emp.stream()
	           .filter(x -> "Roopa".equals(x.getName()))
	           .sorted((i1,i2)-> i2.compareTo(i1)) // Sorting by ID
	           .forEach(System.out::println); 
		      EmployerrStream min1= emp.stream()
		      //.map(x -> x)
	            // Sorting by ID
	           .min((i1,i2)-> i1.compareTo(i2)).get();
		      EmployerrStream max1= emp.stream()
	           //.map(x -> x)
	            // Sorting by ID
	           .max((i1,i2)-> i1.compareTo(i2)).get();
		      
		      EmployerrStream min2=emp.stream()
		      .map(x -> x)
	            // Sorting by ID
	           .min((i1,i2)-> i1.compareTo(i2)).get();
		     EmployerrStream max2=emp.stream()
	           .map(x -> x)
	            // Sorting by ID
	           .max((i1,i2)-> i1.compareTo(i2)).get();
		      System.out.println("Max 1"+max1);
		      System.out.println("Max 2"+max2);
		      System.out.println("Min 1"+min1);
		      System.out.println("Min 2"+min2);
		      Optional<EmployerrStream> minEmp = emp.stream()
		                .min(Comparator.comparingInt(EmployerrStream::getId)); // Compare by ID

		            // Finding the maximum element by ID
		      Optional<EmployerrStream> maxEmp = emp.stream()
		                .max(Comparator.comparingInt(EmployerrStream::getId)); // Compare by ID

		            // Printing the results
		      minEmp.ifPresent(emp1 -> System.out.println("Minimum: " + emp1));
		      maxEmp.ifPresent(emp1 -> System.out.println("Maximum: " + emp1));
		            
		      Object[] toArry= emp.stream()
			           .filter(x -> "Roopa".equals(x.getName()))
			           .sorted(Comparator.comparing(EmployerrStream::getId)).toArray();
		      for(Object a:toArry)
		      {
		            System.out.println("ToArrayEg"+a);
		      }
	            Stream.of(new EmployerrStream(5, "Leo"), new EmployerrStream(6, "Nina"))
                .forEach(System.out::println);
		           
		      
	    }
			           
			           //System.out.println(streamSort.toString());        
    
    
    
}
