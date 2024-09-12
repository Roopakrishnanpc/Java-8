
//Abstract class
abstract class Vehicle {
 // Abstract method (does not have a body)
 abstract void start();

 // Regular method
 void stop() {
     System.out.println("The vehicle is stopping.");
 }

 // Abstract variable (constant)
 static final String VEHICLE_TYPE = "Generic Vehicle";
}

//Concrete subclass that extends the abstract class
class Scooter extends Vehicle {
 // Providing implementation of the abstract method
 @Override
 void start() {
     System.out.println("The Scooty is starting.");
 }
 @Override
 void stop()
 {
	 System.out.println("The scotty is stopping.");
 }
}

//Another concrete subclass
class Bike extends Vehicle {
 // Providing implementation of the abstract method
 @Override
 void start() {
     System.out.println("The bike is starting.");
 }
}

public class AbstractEg {
 public static void main(String[] args) {
     // Creating instances of concrete subclasses
     Vehicle myCar = new Scooter();
     Vehicle myBike = new Bike();

     // Calling the abstract method implemented in subclasses
     myCar.start(); // Output: The car is starting.
     myBike.start(); // Output: The bike is starting.

     // Calling the regular method from the abstract class
     myCar.stop(); // Output: The vehicle is stopping. but since I overriden in scotty class it will be overriden method only
     myBike.stop(); // Output: The vehicle is stopping.

     // Accessing the abstract variable
     System.out.println("Vehicle type: " + Vehicle.VEHICLE_TYPE); // Output: Vehicle type: Generic Vehicle
 }
}
