class Employee1{
	
	int emp_id;
	static int bonus;
	float salary; 
	float total_salary;

	
	void emp_dept_name(String dept) { //without return type & with parameters
		System.out.println("Department:\n" +dept);
		
	}
	void calc() {   //Without return type & parameter
		total_salary = salary+bonus;
		
	}
	
	String compare() { // without parameter and  with return type
		String designation;
		if(salary > 100)
		{
			designation = "manager";
		 
		}
		else 
		{
			designation = " employee";
		}
		System.out.println("Designation :" +designation);
		return designation;
		
	}
	String emp_exp(int year) { // with parameter and return type
		//System.out.println("Exp years:" +year);
		if(year > 10) {
		return "Experienced";
		}
		else
			return "Not Experienced";
	}
	}

public class EmployeeMethodProgram {

	public static void main(String[] args) {
      Employee1 emp = new Employee1();
      emp.emp_id = 101;
      emp.salary= 1004.89f;
      Employee1.bonus = 100;
      emp.calc();
      emp.emp_dept_name("Accounting");
      System.out.println("Employee Id:\n"+emp.emp_id);
      System.out.println("Total Salary:\n" +emp.total_salary);
      System.out.println(emp.emp_exp(12));
      
      
      
	}

}
