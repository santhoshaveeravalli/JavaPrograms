import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int empId;
	String empName;
	String gender;
	String email;
	float salary;
	
Employee(int empid,String empname,String gender, String email,float salary){
	this.empId = empid;
	this.empName = empname;
	this.gender = gender;
	this.email= email;
	this.salary = salary;
}
String GetEmployeeDetails() {
	return "EmployeeId : "+empId+" , " +
		   "Employee Name:" +empName+" ,"+
		   "Employee Gender:"+gender+","+
		   "Employee Email:" +email+" , "+
	       "Employee Salary:" +salary;
}
//To return the values 
int getEmpId() {
	return empId;
}
void setEmpId(int empid) {
	empId = empid;
}
String getEmpName() {
	return empName;
}
void setEmpName(String empname) {
	empName = empname;
}
String getGender() {
	return gender;
}
void setGender(String Gender) {
	gender = Gender;
}
String getEmpEmail() {
	return email;
}
void setEmpEmail(String empEmail) {
	email = empEmail;
}
float getEmpSalary() {
	return salary;
}
void setEmpSalary(float empSalary) {
salary = empSalary;
}
}
class EmployeeDetails {
	ArrayList<Employee> al = new ArrayList<>();
	
	boolean addEmployee(Employee e) {
		return al.add(e);
	}
	
	boolean deleteEmployee(int empId, boolean isRemoved) {
		isRemoved = false;
		
		Iterator<Employee> it = al.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	String showPaySlip(int empId) {
		String paySlip = "Invalid employee Details";
		
		for (Employee e : al) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay for Employee with employee id  " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}
	
	Employee[] print() {
		Employee[] empArray = new Employee[al.size()];
		for (int i = 0; i < al.size(); i++)
			empArray[i] = al.get(i);
		return empArray;
	}
	

}
public class EmployeeManagement {

	public static void main(String[] args) {
	EmployeeDetails ed = new EmployeeDetails();
	Employee e0 = new Employee(101, "San","Female", "san@gmail.com", 60000.76f);
	Employee e1 = new Employee(134, "Nag","Male", "nag@gmail.com", 75000.34f);
	Employee e2 = new Employee(191, "Vee","Female", "vee@gmail.com", 85000.99f);
	Employee e3 = new Employee(121, "Gur","Male", "gur@gmail.com", 55000.54f);
		ed.addEmployee(e0);
		ed.addEmployee(e1);
		ed.addEmployee(e2);
		ed.addEmployee(e3);

		for (Employee emp : ed.print())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		ed.deleteEmployee(101, true);
		
		for (Employee emp : ed.print())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(ed.showPaySlip(121));
	}
		}
	



