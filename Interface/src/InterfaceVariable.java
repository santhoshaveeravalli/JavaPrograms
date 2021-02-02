interface Parent{
	int age = 28;
	interface kid{
		int age = 5;
	}
}
interface Child {
	int age = 18;
}
class DrivingLicense implements Parent,Child{
		void ageDetails() {
		System.out.println("Parent age:" +Parent.age);
		System.out.println("Child age:"+Child.age);
		System.out.println("Kids Age" +Parent.kid.age);
	}
}
public class InterfaceVariable {

	public static void main(String[] args) {
		DrivingLicense dl = new DrivingLicense();
		dl.ageDetails();

	}

}
