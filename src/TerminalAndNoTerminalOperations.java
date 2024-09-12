import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Student
{
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
public void printameStudent()
{
	System.out.println("The ame of the student is"+name);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
public class TerminalAndNoTerminalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Roopa Chithra");
        Student s2=new Student(2, "Roopa Krishnan");
        Student s3=new Student(3, "Roopa Sam");
        Student s4=new Student(4, "Roopa");
        List<Student> studList=Arrays.asList(s1,s2,s3,s4);
        List<Integer> intList=Arrays.asList(1,44,3,88,89);
        //first filter then thos filtered value ll be mapped and then again filter
        intList.stream().filter(x->x>=20).map(a->a+a).filter(a->a>6).forEach(x->System.out.println(x));
        System.out.println(intList.stream().filter(x->x>=20).map(a->a+a).filter(a->a>6).limit(1).collect(Collectors.toList()));
        System.out.println(intList.stream().filter(x->x>=20).map(a->a+a).filter(a->a>6).count());
        //peek(System.out::println) used for debugging your intermediate streams
        System.out.println(intList.stream().filter(x->x>=20).peek(System.out::println).map(a->a+a).peek(System.out::println).filter(a->a>6).peek(System.out::println).count());
        System.out.println("reduce eg : "+intList.stream().reduce((a, b)-> a+b).get());
        System.out.println("reduce eg : "+studList.stream().map(Student::getId)  // Map to IDs
                .reduce(0, (a, b) -> a + b));
        
        studList.stream().filter(e->e.getId()>=2).
        map(e->{
        	e.printameStudent(); 
        return e.getName()+ " - " +e.getId();
        })//remove the below line and check nothing will be printed as terminal operators foreach count mimmax are egarly loaded and intermidate like map, filter are  lazy
        .forEach(x->System.out.println("At Last"+x));
        
        System.out.println("limit eg : ");
        studList.stream().limit(2).forEach(x-> System.out.print(x));//.stream().limit(2));
        System.out.println();
        //anymatch always boolean and || all match is &&
        System.out.println(studList.stream().parallel().anyMatch(e-> e.getName().contains("Roopa")));
        System.out.println(studList.stream().parallel().allMatch(e-> e.getName().contains("Roopa")));
        //nothing should match if matched then false
        System.out.println(studList.stream().parallel().noneMatch(e-> e.getName().contains("Roopa")));
        //default even if sequential or parallel it will findfirst but findany in parallel will findany no order when you give sequential it will find any but in sequential so first
        System.out.println(studList.stream().parallel().filter(e-> e.getName().contains("Roopa")).findFirst().get());
        System.out.println(studList.stream().parallel().filter(e-> e.getName().contains("Roopa")).findAny().get());
       
        System.out.println(studList.stream().filter(e-> e.getName().contains("Roopa")).findFirst().get());
        System.out.println(studList.stream().filter(e-> e.getName().contains("Roopa")).findAny().get());
	}

}
