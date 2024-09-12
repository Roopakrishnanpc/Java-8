class Animal {
    // Overloaded method: method overloading
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    void makeSound(String sound) {
        System.out.println("Animal makes a sound: " + sound);
    }

    // Method to be overridden: method overriding
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Cat extends Animal {
    // Overriding method: method overriding
    @Override
    void eat() {
    	//super.eat();
        System.out.println("Cat eats Cat food");
    }
    
    // Overloaded method: method overloading
    void makeSound() {
    	super.makeSound();
        System.out.println("Cat barks without variable");
    }
    void makeSound(int times) {
        for (int i = 1; i <= times; i++) {
        	//super.makeSound("Meow");
            System.out.println("Cat barks " + i+" time with variable & without super");
        }
    }
    // Another overloaded method in Cat class
    void makeSound(int times, String sound) {
        for (int i = 1; i <= times; i++) {
        	super.makeSound(sound);
            System.out.println("Cat barks " + i+" time with variable & with super");
        }
    }
}

public class OverridingEg {
    public static void main(String[] args) {
        // Demonstrating method overloading
        Animal animal = new Animal();
        animal.eat();
        animal.makeSound();            // Calls the no-argument method
        animal.makeSound("Roar");      // Calls the method with a string argument
        
        Cat cat = new Cat();
        cat.makeSound();              // Calls the overridden method in Cat
        cat.makeSound(3);             // Calls the overloaded method with an integer argument without super
        cat.makeSound(2, "Meow");
        cat.makeSound(null);//animal
        // Demonstrating method overriding
        Animal myCat = new Cat();     // Upcasting: Animal reference to Cat object
        myCat.eat();                 // Calls the overridden method in Cat
        Cat downCat=(Cat) myCat;
        downCat.eat();
        System.out.println("Called");
        downCat.eat();//calls cat
        downCat.makeSound();
        downCat.makeSound(1);
        downCat.makeSound("Meeeeeow");//animal
        downCat.makeSound(1, null);
        // Demonstrating method overloading in Cat class
        Cat myActualCat = new Cat();
        myActualCat.makeSound();     // Calls the overloaded method in Cat
        myActualCat.makeSound(2);    // Calls the overloaded method with an integer argument
    }
}