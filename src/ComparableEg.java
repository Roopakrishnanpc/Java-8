import java.util.Arrays;
import java.util.Objects;

class Employees  implements Comparable<Employees> {
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
        Employees other = (Employees) obj;
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
        return "Employees [id=" + id + ", name=" + name + "]";
    }

	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		//return Integer.compare(this.id, o.id);
		//return 0;
		return this.name.compareTo(o.name);
		//return this.id=o.id;
	}
}
public class ComparableEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {5,7,9,1};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		Employees[] emp = new Employees[5];
		emp[0]=new Employees(11111,"Roopa");
		emp[1]=new Employees(285,"Sam");
		emp[2]=new Employees(3,"Appa Love");
		emp[3]=new Employees(4,"Amma Love");
		//while trying comment below and try
		emp[4]=new Employees(5,"Ashu Tambi Love");
		System.out.println(Arrays.toString(emp));
		for(int i=0;i<=4;i++)
		{
		//System.out.println(emp[i].toString());//here you cant print null
		System.out.println(emp[i]);//here prints null
		}
		for(Employees print:emp)
		{
			System.out.println(print);
		}
        // Sort Employees array BY NAME OR ID
        Arrays.sort(emp);

        // Print sorted Employees array
        System.out.println("Sorted Employees array: " + Arrays.toString(emp));//simply when you run this throws error
		
		//Exception in thread "main" java.lang.ClassCastException: class Employees cannot be cast to class java.lang.Comparable (Employees is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
		//at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
		//at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
		//at java.base/java.util.Arrays.sort(Arrays.java:1041)
		//at ComparableEg.main(ComparableEg.java:74)
	}

}
