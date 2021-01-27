class Studentdetail{
	
	int stuid;
	static String clgname;
	int clgcode;
	String deptname;
	
	Studentdetail()
	{
		stuid=40109;
		clgname = "University";
		deptname = "Computer Science";
		clgcode = 1289;
	}
	void display() {
		System.out.println("Student Id:" +stuid);
		System.out.println("College Name:"+clgname);
		System.out.println("College Code:"+clgcode);
		System.out.println("Department Name:"+deptname);
	}
}

public class ConstructorPrgm {

	public static void main(String[] args) {
		
		Studentdetail studet= new Studentdetail();
		studet.display();
		}

}
