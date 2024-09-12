class Dog
{
    private String breed;
    private int age;

    // Default constructor
    public Dog() {
        this.breed = "Unknown";
        this.age = 0;
        System.out.println("Dog default constructor");
    }

    // Parameterized constructor
    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
        System.out.println("Dog parameterized constructor");
    }
	protected void specialCharcteristic()//private will not be visible by other class
	{
		System.out.println("Barks");
	}
	public void barking() {
		System.out.println("All dog barks");
	}
	public void wagTails() {
		System.out.println("All dog Wag Tails");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + "]";
	}
}
class Lab extends Dog
{
	public String color="Child Color";
    // Default constructor
    public Lab() {
        super(); // Calls the default constructor of Dog
        this.color = "Unknown";
        System.out.println("Lab default constructor");
    }

    // Parameterized constructor
    public Lab(String breed, int age, String color) {
        super(breed, age); // Calls the parameterized constructor of Dog
        this.color = color;
        System.out.println("Lab parameterized constructor");
    }

    @Override
	public String toString() {
		//return "Lab [color=" + color + "]";
    	 return "Lab [color=" + color + ", " + super.toString() + "]";
	}


	@Override
	protected void specialCharcteristic()//cant make private cant make more restricted but can make as same or less
	{
		System.out.println("I am friendly of all dogs");
	}
}
public class RestrictionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();// Upcasting: Lab instance referenced by Dog type
		Dog dogup=new Lab();
		dog.barking();
		dog.wagTails();
		dog.specialCharcteristic();
		//Lab lab=(Lab)dog;
		//safe casting
		if (dogup instanceof Lab) {
            Lab lab = (Lab) dogup; // Downcasting: Dog instance actually a Lab instance
            System.out.println(lab.color); // Output: Child Color
            lab.barking();
            lab.wagTails();
            lab.specialCharcteristic();
        }
		Lab labDog=new Lab();
		labDog.barking();
		labDog.wagTails();
		labDog.specialCharcteristic();
		outside();
		outside_private();
		outside_protected();
		Dog dogDefault=new Dog();//Dog default constructor
        System.out.println("Cons parm"+dogDefault
        		+" basic way only parent called");

		Dog dogupDeafult = new Lab();//Dog default constructor & Lab default constructor

        System.out.println("Cons parm"+dogupDeafult+ " upcasting");
        if (dogupDeafult instanceof Lab) {
            Lab lab = (Lab) dogupDeafult; // Downcasting
            System.out.println(lab.color); // Output: Yellow
            System.out.println(lab);
        }
        Lab labDefult = new Lab();//Dog default constructor & Lab default constructor
        Dog dog1 = new Dog("Beagle", 5); // Dog parameterized constructor
        System.out.println("Cons parm"+dog1+" basic way only parent called");
        Dog dogup1 = new Lab("Labrador", 3, "Yellow"); // Upcasting // Dog parameterized constructor & // Lab parameterized constructor

    

        System.out.println("Cons parm"+dogup1+ " upcasting");
        if (dogup1 instanceof Lab) {
            Lab lab = (Lab) dogup1; // Downcasting
            System.out.println(lab.color); // Output: Yellow
            System.out.println(lab);
        }
        System.out.println("Cons parm child class way");
        Lab labDog1 = new Lab("Labrador", 3, "Black"); // Using parameterized constructor// Dog parameterized constructor & // Lab parameterized constructor

        System.out.println("Cons parm"+labDog1 +" child class way");

	}
	static void outside()
	{
		System.out.println("Outside main");
	}
	private static void outside_private()
	{
		System.out.println("Outside main private");
	}
	protected static void outside_protected()
	{
		System.out.println("Outside main protected");
	}
	
}
