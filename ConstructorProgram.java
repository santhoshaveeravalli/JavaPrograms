class Carsdetails{
	String company;
	String model;
	static int makeyear;
	float price;
	Carsdetails(String a,String b,int c,float d){
		company = a;
		model = b;
		makeyear = c;
		price = d;
	}
	void display() {
		System.out.println("\nCar Company:" +company);
		System.out.println("Model:" +model);
		System.out.println("Make year:" +makeyear);
		System.out.println("Price of the car:" +price);
	}
}
public class ConstructorProgram {

	public static void main(String[] args) {
	   Carsdetails car = new Carsdetails("Honda","CR-V",2020,26780.3f);
	   car.display();
	   
	   Carsdetails car1 = new Carsdetails("Cadillac","Escalade",2021,89786.76f);
	   car1.display();  
	}

}
