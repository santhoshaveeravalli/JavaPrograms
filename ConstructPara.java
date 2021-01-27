class Employeedetails{
	int empid;
	float salary;
	long bonus;
	String deptname;
	long total;
	Employeedetails(int x,float y, long z,String d){
		empid= x;
		salary = y;
		bonus = z;
		deptname = d;
	}
	void display() {
		total = (long) (salary+bonus);
		System.out.println("\nEmployee Id:" +empid);
		System.out.println("Salary:" +salary);
		System.out.println("Bonus:"+bonus);
		System.out.println("Department Name:"+deptname);
		System.out.println("Total:" +total);
	}
}
public class ConstructPara {

	public static void main(String[] args) {
		Employeedetails emp = new Employeedetails(123,19675.45f,1256L,"Finance");
		emp.display();
		Employeedetails emp1 = new Employeedetails(456,10000.11f,1500L,"Accounting");
		emp1.display();
		}

}
