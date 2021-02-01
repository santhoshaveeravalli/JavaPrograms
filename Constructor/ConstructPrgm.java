class mobiledetails{
	String model;
	int price;
	mobiledetails(String model, int price){
		this.model = model;
		this.price = price;
	}
	void display() {
		System.out.println("Enter Model:" +model);
		System.out.println("Enter price:"+price);
	}
}
class iphone extends mobiledetails{
	int makeyear;
	iphone(String model, int price, int makeyear) {
	super(model, price);
	this.makeyear = makeyear;
	}

	void display1() {
		System.out.println("Enter Makeyear:" +makeyear);
	}
	
}
 class nokia extends mobiledetails{
	 int no_of_sim;
	 nokia(String model, int price, int no_of_sim){
		 super(model,price);
	this.no_of_sim = no_of_sim;	 
	 }
	 void display2() {
		 System.out.println("Number of sims:" +no_of_sim);
	 }
 }
public class ConstructPrgm {

	public static void main(String[] args) {
		mobiledetails md = new mobiledetails("Samsung Note", 999);
		md.display();
		iphone ip = new iphone("Iphone 10",1200,2021);
		ip.display();
		ip.display1();
	    nokia nk = new nokia("Nokia",899,2);
	    nk.display();
	    nk.display2();

	}

}
