import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class EmployeEquals  {
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
        EmployeEquals other = (EmployeEquals) obj;
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
        return "EmployeEquals [id=" + id + ", name=" + name + "]";
    }

	public EmployeEquals(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//@Override

//	public static Comparator<EmployeEquals> NameComp=new Comparator<EmployeEquals>() {
//
//		@Override
//		public int compare(EmployeEquals o1, EmployeEquals o2) {
//			// TODO Auto-generated method stub
//			//return 0;
//			return o1.getName().compareTo(o2.getName());
//		}
//	};
}
public class Equals_HashCodeEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeEquals[] employees = new EmployeEquals[5];
        employees[0] = new EmployeEquals(11111, "Roopa");
        employees[1] = new EmployeEquals(285, "Sam");
        employees[2] = new EmployeEquals(3, "Appa Love");
        employees[3] = new EmployeEquals(4, "Amma Love");
        employees[4] = new EmployeEquals(5, "Ashu Tambi Love");
        EmployeEquals[] emp=employees.clone();
        
        emp[4]=new EmployeEquals(1, "Ashu Tambi Love");
     
		EmployeEquals[] employees1 = new EmployeEquals[5];
        employees1[0] = new EmployeEquals(11111, "Roopa");
        employees1[1] = new EmployeEquals(285, "Sam");
        employees1[2] =  new EmployeEquals(4, "Amma Love");// new EmployeEquals(3, "Appa Love");
        employees1[3] = new EmployeEquals(3, "Appa Love");
       // employees1[3] = new EmployeEquals(4, "Amma Love");
        employees1[4] = new EmployeEquals(5, "Ashu Tambi Love");
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

