class Vehicle {
	int i;
	void transport() {
		
		System.out.println("Used for transportation");
		for(i=1; i<=10;i++) {
class Car{	
	void audi() {
		System.out.println("German automobile manufacturer-" +i);
	}
}
	Car c = new Car();
	c.audi();
		}
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.transport() ;
	}
	}

