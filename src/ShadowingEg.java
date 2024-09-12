class Shadw
{
    private String breed;
    private int age;

    // Default constructor
    public Shadw() {
        this.breed = "Unknown";
        this.age = 0;
        System.out.println("Shadw default constructor");
    }

    // Parameterized constructor
    public Shadw(String breed, int age) {
        this.breed = breed;
        this.age = age;
        System.out.println("Shadw parameterized constructor");
    }
	protected static void specialCharcteristic()//private will not be visible by other class
	{
		System.out.println("Barks");
	}
	public void barking() {
		System.out.println("All Shadw barks");
	}
	public void wagTails() {
		System.out.println("All Shadw Wag Tails");
	}

	@Override
	public String toString() {
		return "Shadw [breed=" + breed + ", age=" + age + "]";
	}
}
class ShadwChild extends Shadw
{
	public String color="Child Color";
    // Default constructor
    public ShadwChild() {
        super(); // Calls the default constructor of Shadw
        this.color = "Unknown";
        System.out.println("ShadwChild default constructor");
    }

    // Parameterized constructor
    public ShadwChild(String breed, int age, String color) {
        super(breed, age); // Calls the parameterized constructor of Shadw
        this.color = color;
        System.out.println("ShadwChild parameterized constructor");
    }

    @Override
	public String toString() {
		//return "ShadwChild [color=" + color + "]";
    	 return "ShadwChild [color=" + color + ", " + super.toString() + "]";
	}


	//@Override - canot be overriden static methods
	protected static void specialCharcteristic()//cant make private cant make more restricted but can make as same or less
	{
		System.out.println("I am friendly of all Shadws");
	}
}
public class ShadowingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shadw dog=new ShadwChild();
		//dog.barking();
		//dog.wagTails();
		Shadw.specialCharcteristic();
		dog.specialCharcteristic(); //since given reference of child class parent method only will be called
		ShadwChild sh=(ShadwChild)dog;
		sh.specialCharcteristic();//this will call child though static
		ShadwChild sha=new ShadwChild();
		sha.specialCharcteristic();//child though static
		ShadwChild.specialCharcteristic();
	}

}
