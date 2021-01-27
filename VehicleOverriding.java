class Vehicle{
	String type;
	int mileage;
	int wheels;
	void type() {
		System.out.println("Vehicle Type");
	}
	void mileage() {
		System.out.println(0);
	}
	void wheels() {
		System.out.println(0);
	}
}
class Car1 extends Vehicle{
	void type() {
		System.out.println("Vehicle type is Car");
	}
	void mileage() {
		System.out.println("Mileage is 20miles");
	}
	void wheels() {
		System.out.println(4);
	}
	
}
class bike extends Vehicle{
	void type() {
		System.out.println("Vehicle type is bike");
	}
	void mileage() {
		System.out.println(15);
	}
	void wheels() {
		System.out.println(2);
	}
}
public class VehicleOverriding {

	public static void main(String[] args) {
		Vehicle V = new Vehicle();
		V.type();
		V.mileage();
		V.wheels();
		
		V = new Car1();
		V.type();
		V.mileage();
		V.wheels();
		
		V = new bike();
		V.type();
		V.mileage();
		V.wheels();
				
	}

}
