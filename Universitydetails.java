class University {
	
	void listOfColleges() {
		System.out.println("1.ASU 2.CSU 3.SJSU 4.USF 5.UMKC");
	}
	void selectCollege(int clg1,int clg2) {
		System.out.println("Selected College:" +clg1 +"\n" +clg2);
	}
	String seatAlloted() {
		return "CSU";
		
	}
	String payFee(int fee) {
		System.out.println("Fee Paid: "+fee);
		return "Paid";
		
	}
}
public class Universitydetails {

	public static void main(String[] args) {
		University clg = new University();
		clg.listOfColleges();
		clg.selectCollege(1, 2);
		System.out.println("Seat Alloted:" +clg.seatAlloted());
		System.out.println("Balance:" +clg.payFee(1000));
		
		


	}

}
