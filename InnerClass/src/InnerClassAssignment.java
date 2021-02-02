class Company{
	void employee() {
		System.out.println(" Employee Method");
	}
class Department{
		void salary() {
			System.out.println("Accounting Department Minimum salary is 20000 ");
		}
	}
}
public class InnerClassAssignment {
	public static void main(String[] args) {
		Company c = new Company();
		c.employee();
		Company.Department s= c.new Department();//Use Outer class object 
		s.salary();
	}

}
