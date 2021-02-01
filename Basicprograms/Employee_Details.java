class Employee{
	int id;
	static int bonus;
	float salary;
	static String dept_name;
	float total_salary;

void cal() {
	total_salary =salary+bonus;
	}
}
public class Employee_Details {

	public static void main(String[] args) {
		Employee.bonus= 1000;
		Employee.dept_name = "Marketing";
		
		Employee emp = new Employee();
		emp.id = 100;
		emp.salary = 5000.78f;
		emp.cal();
		
		System.out.println("Emp Id:" +emp.id);
		System.out.println("Bonus:" +Employee.bonus);
		System.out.println("Dept Name:"+Employee.dept_name);
		System.out.println("Salary:" +emp.salary);
		System.out.println("Total Salary:"+emp.total_salary);
		
	}
}

