class Car {
	String Company;
	String model;
	static int year_make;
	
}

public class Cars {

	public static void main(String[] args) {
		Car.year_make = 2000;
		
		Car car = new Car();
		car.Company = "Nissan";
		car.model = "Altima";
		Car cars = new Car();
		cars.Company = "Honda";
		cars.model = "CR-V";
		
		System.out.println("Company" +car.Company);
		System.out.println("Model:" +car.model);
		System.out.println("Year:" + Car.year_make);
		
System.out.println("=============================================");
		System.out.println("Company" +cars.Company);
		System.out.println("Model:" +cars.model);
		System.out.println("Year:" + Car.year_make);
		

	}

}
