import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class EmployeeCor  implements Comparable<EmployeeCor> {
    private int id;
    private String name;

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        EmployeeCor other = (EmployeeCor) obj;
        return id == other.id && Objects.equals(name, other.name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeCor [id=" + id + ", name=" + name + "]";
    }

	public EmployeeCor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(EmployeeCor o) {
		// TODO Auto-generated method stub
		//return Integer.compare(this.id, o.id);
		return this.id-o.id;
	}
//	public static Comparator<EmployeeCor> NameComp=new Comparator<EmployeeCor>() {
//
//		@Override
//		public int compare(EmployeeCor o1, EmployeeCor o2) {
//			// TODO Auto-generated method stub
//			//return 0;
//			return o1.getName().compareTo(o2.getName());
//		}
//	};
	//If mentioned private then not visible
	public static Comparator<EmployeeCor> NameComp= (o1,o2) ->  
			// TODO Auto-generated method stub
			//return 0;
			 o1.getName().compareTo(o2.getName());
		
	
}
class Comparators {
    public static Comparator<EmployeeCor> NameComp = (o1, o2) -> 
        o1.getName().compareTo(o2.getName());
}
public class ComparatorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCor[] employees = new EmployeeCor[5];
        employees[0] = new EmployeeCor(11111, "Roopa");
        employees[1] = new EmployeeCor(285, "Sam");
        employees[2] = new EmployeeCor(3, "Appa Love");
        employees[3] = new EmployeeCor(4, "Amma Love");
        employees[4] = new EmployeeCor(5, "Ashu Tambi Love");
        EmployeeCor[] emp=employees.clone();
        
        emp[4]=new EmployeeCor(1, "Ashu Tambi Love");
        Arrays.sort(emp);
        // Print unsorted Employees array
        System.out.println("Unsorted Employees array but using the comparable compare to you have to use in same class by default: " + Arrays.toString(emp));

        // Sort Employees array by name using NameComp comparator
        Arrays.sort(emp, Comparators.NameComp);
        System.out.println("Employees array sorted by name by lampbda compare to using new class: " + Arrays.toString(emp));
//n nod of comparatpr class can be created
        Arrays.sort(emp, EmployeeCor.NameComp);

        // Print sorted Employees array by name
        System.out.println("Employees array sorted by name by lampbda compare to: " + Arrays.toString(emp));
		EmployeeCor[] employees1 = new EmployeeCor[5];
        employees1[0] = new EmployeeCor(11111, "Roopa");
        employees1[1] = new EmployeeCor(285, "Sam");
        employees1[2] =  new EmployeeCor(4, "Amma Love");// new EmployeeCor(3, "Appa Love");
        employees1[3] = new EmployeeCor(3, "Appa Love");
       // employees1[3] = new EmployeeCor(4, "Amma Love");
        employees1[4] = new EmployeeCor(5, "Ashu Tambi Love");
        System.out.println(employees==employees1);//false
        System.out.println("Arrays are equal: " + Arrays.equals(employees, employees1));
        boolean arraysEqual = true;
        if (employees.length != employees1.length) {
            arraysEqual = false;
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (!employees[i].equals(employees1[i])) {
                    arraysEqual = false;
                    System.out.println("Difference at index " + i + ":");
                    System.out.println("Array 1: " + employees[i]);
                    System.out.println("Array 2: " + employees1[i]);
                }
//                if (employees[i].equals(employees1[i])) {
//                    arraysEqual = true;
//                    System.out.println("Difference at index " + i + ":");
//                    System.out.println("Array 1: " + employees[i]);
//                    System.out.println("Array 2: " + employees1[i]);
//                }
//                else
//                {
//                	arraysEqual = false;
//                    System.out.println("false Difference at index " + i + ":");
//                    System.out.println("Array 1: " + employees[i]);
//                    System.out.println("Array 2: " + employees1[i]);
//                }
            }
        }
        System.out.println("Arrays are equal: " + arraysEqual);
	}

}

