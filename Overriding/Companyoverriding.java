class Companytype{
	String type;
	int employees;
	void type() {
		System.out.println("Software or Hardware");
	}
	void emp() {
		System.out.println(120);
	}
}
class Software extends Companytype{
	void type() {
		System.out.println("Software");
	}
	void emp() {
		System.out.println(50);
	}
	
}
class Hardware extends Companytype{
	void type() {
		System.out.println("Hardware");
	}
	void emp() {
		System.out.println(70);
	}
	
}
public class Companyoverriding {

	public static void main(String[] args) {
		Companytype ct = new Companytype();
		ct.type();
		ct.emp();
		ct = new Software();
		ct.type();
		ct.emp();
		ct = new Hardware();
		ct.type();
		ct.emp();
		
	}

}
