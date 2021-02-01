interface Vehicle{
	void cost();
	void mileage();
}
abstract class Car implements Vehicle{
	void wiper() {
		
	}
}
abstract class Bike implements Vehicle{
	void stand() {
		
	}
}
class Audi extends Car{
	public void cost() {
		System.out.println("Q7 price is 54800 USD");
	}
	public void mileage() {
		System.out.println("Upto 19 miles ");
	}
	public void wiper() {
		System.out.println("Q7 Car has Windshield Viper");
	}
}
class Bmw extends Car{
	public void cost() {
		System.out.println("X5 price is 59400 Usd");
	}
	public void mileage() {
		System.out.println("upto 20 miles");
	}
	public void wiper() {
		System.out.println("BMW Car has Windshield Viper");
	}
}
class Apache extends Bike{
	public void cost() {
		System.out.println("Price is 100000");
	}
	public void mileage() {
		System.out.println("upto 25 miles");
	}
	public void stand() {
		System.out.println("Bike has stand");
	}
}
class Fz extends Bike{
	public void cost() {
		System.out.println("Price is 98000");
	}
	public void mileage() {
		System.out.println("Upto 30 miles");
	}
	public void stand() {
		System.out.println("Bike has stand");
	}
}

public class VehicleInterfaceProgram {

	public static void main(String[] args) {
		Car c;
		c= new Audi();
		c.cost();
		c.mileage();
		c.wiper();
		c= new Bmw();
		c.cost();
		c.mileage();
		c.wiper();
		
		Bike b;
		b = new Apache();
		b.cost();
		b.mileage();
		b.stand();
		b = new Fz();
		b.cost();
		b.mileage();
		b.stand();
		

	}

}
