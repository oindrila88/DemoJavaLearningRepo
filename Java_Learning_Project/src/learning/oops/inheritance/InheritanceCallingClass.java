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
		//Car car = new Car();
		
		//First, "No-Argument Constructor" of immediate "Parent Class" is executed, followed by corresponding "Overloaded Constructor" of "Child Class"
		Car car = new Car(5, "Hyundai");
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
		
		
		Vehicle vehicle1 = new Car();
		
		//When an "Overridden Method" is called by an "Object Reference", JVM determines which version of that "Method" to execute based on the "Type of Object" the "Object Reference" refers to
		//Here, the "Object Reference" "vehicle1" refers to the "Car" "type of Object". Hence, the "start()" Method of "Car" Class would be executed
		vehicle1.start();
		
		//Here, the "Object Reference" "vehicle1" refers to the "Car" "type of Object". Hence, the "honk()" Method of "Car" Class would be executed
		vehicle1.honk();
		
		vehicle1.stop();
		vehicle1.vehicleInformation();
	}
}