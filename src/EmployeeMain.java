import java.util.Objects;

class Employee implements Cloneable {
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
        Employee other = (Employee) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee();
            emp.setId(1);
            emp.setName("John Doe");

            // Cloning example
            Employee empClone = (Employee) emp.clone();

            // Display the original and cloned Employee objects
            System.out.println("Original: " + emp);
            System.out.println("Clone: " + empClone);
            //Pass by reference
            copyByRefernce(emp);
            System.out.println(emp);
            int a=5;
            copyByValue(a);
            System.out.println(a);
            copyByValue(100);
            System.out.print(copyByValuereturn(100));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    private static void copyByValue(int i) {
		// TODO Auto-generated method stub
    	i=10;
		
	}
    private static int copyByValuereturn(int i) {
		// TODO Auto-generated method stub
    	i=10;
		return i;
	}
	private static void copyByRefernce(Employee emp)
    {
    	emp.setId(23);
    	emp.setName("Sri");
    }
}
