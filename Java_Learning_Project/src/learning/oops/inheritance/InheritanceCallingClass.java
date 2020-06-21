package learning.oops.inheritance;

public class InheritanceCallingClass
{
	public static void main(String[] args)
	{
		/*
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.honk();
		vehicle.stop();
		vehicle.vehicleInformation();
		Vehicle.engineVersionInformation();
		Vehicle.staticVehicleMethod();
		
		//First, "No-Argument Constructor" of immediate "Parent Class" is executed, followed by "No-Argument Constructor" of "Child Class"
		Car car = new Car();
		//Flow of "Blocks" and "Constructors", when "Child Class Instance" is created by "No-Argument Constructor" of "Child Class" -
		//1. "Static Block" of "Parent Class"
		//2. "Static Block" of "Child Class"
		//3. "Instance Initialization Block" of "Parent Class"
		//4. "No-Argument Constructor" of "Parent Class"
		//5. "Instance Initialization Block" of "Child Class"
		//6. "No-Argument Constructor" of "Child Class"
		
		//First, "No-Argument Constructor" of immediate "Parent Class" is executed, followed by corresponding "Overloaded Constructor" of "Child Class"
		Car car = new Car(5, "Hyundai");
		//Flow of "Blocks" and "Constructors", when "Child Class Instance" is created by "Parameterized Constructor" of "Child Class" -
		//1. "Static Block" of "Parent Class"
		//2. "Static Block" of "Child Class"
		//3. "Instance Initialization Block" of "Parent Class"
		//4. "No-Argument Constructor" of "Parent Class"
		//5. "Instance Initialization Block" of "Child Class"
		//6. "Parameterized Constructor" of "Child Class"
		
		//Once, "Parent Class" "Constructor" "Vehicle(int, String, String)" is called from "Child Class" using "super()" within the "Overloaded Constructor" of "Child Class", instead of the "No-Argument Constructor" of immediate "Parent Class", the provided "Overloaded Constructor" "Vehicle(int, String, String)" of the immediate "Parent Class" is executed, followed by corresponding "Overloaded Constructor" of "Child Class"
		Car car1 = new Car(4, "Audi");
		//Flow of "Blocks" and "Constructors", when "Child Class Instance" is created by "Parameterized Constructor" of "Child Class", which explicitly calls the "Overloaded Constructor" "Vehicle(int, String, String)" of the immediate "Parent Class" -
		//1. "Static Block" of "Parent Class"
		//2. "Static Block" of "Child Class"
		//3. "Instance Initialization Block" of "Parent Class"
		//4. "Parameterized Constructor" of "Parent Class"
		//5. "Instance Initialization Block" of "Child Class"
		//6. "Parameterized Constructor" of "Child Class"
				
		car.start();
		car.honk();
		car.stop(6);
		car.openDoors();
		car.carInformation();
		car.vehicleInformation(); //This method is called from Parent Class
		Car.engineVersionInformation(); //This method is called from Parent Class
		Car.noOfDoorsInformation();
		Car.staticVehicleMethod();
		*/
		
		//"Object Reference" of a "Parent Class" can be created with any of its "Child Class" Object
		Vehicle vehicle1 = new Car();
		//Flow of "Blocks" and "Constructors", when "Child Class Instance" is created by "No-Argument Constructor" of "Child Class" in a "Parent Class" "Object Reference" -
		//1. "Static Block" of "Parent Class"
		//2. "Static Block" of "Child Class"
		//3. "Instance Initialization Block" of "Parent Class"
		//4. "No-Argument Constructor" of "Parent Class"
		//5. "Instance Initialization Block" of "Child Class"
		//6. "No-Argument Constructor" of "Child Class"
		
		//When an "Overridden Method" is called by an "Object Reference", JVM determines which version of that "Method" to execute based on the "Type of Object" the "Object Reference" refers to
		//Here, the "Object Reference" "vehicle1" refers to the "Car" "type of Object". Hence, the "start()" Method of "Car" Class would be executed
		vehicle1.start();
		
		//Here, the "Object Reference" "vehicle1" refers to the "Car" "type of Object". Hence, the "honk()" Method of "Car" Class would be executed
		vehicle1.honk();
		
		vehicle1.stop();
		vehicle1.vehicleInformation();
		
		//"Object Reference" of a "Child Class" cannot be created with any of its its "Parent Class" Object. Trying to do so will result in "Compile-Time Error"
		//Car car1 = new Vehicle();
		//Compile-Time Error: "Type mismatch: cannot convert from Vehicle to Car"
	}
}