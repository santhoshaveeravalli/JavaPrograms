abstract class Animal{
	abstract void animaltype();
	abstract void lifespan();
	void breath(){
		System.out.println("Printing Breath Method");
	}
}
class Lion extends Animal{
	void lifespan() {
		System.out.println("Lion life span is 10-14 years");
	}
		void animaltype() {
			System.out.println("Lion is an Carnivorous Animal");
		}
	}
class Horse extends Animal{
	void animaltype() {
		System.out.println("Horse is a Herbivores Animal");
	}
	void lifespan() {
		System.out.println("Hourse lifespan is 25-20 years");
	}
	
}
class Bears extends Animal{
	void animaltype() {
		System.out.println("Bear is an Omnivorous");
	}
	void lifespan() {
		System.out.println("Bear life span is approx 20 years");
	}
}
public class AbstractAssignment {
	public static void main(String args[])
	{
		Animal L = new Lion();
		L.animaltype();
		L.lifespan();
		Animal B = new Bears();
		B.animaltype();
		B.lifespan();
		Animal H = new Horse();
		H.animaltype();
		H.lifespan();
}
}