
import java.util.ArrayList;
import java.util.Iterator;
class Employee{
	int empid;
	String empName;
	String email;
	float salary;
Employee(int empid,String empName, String email,float salary){
	this.empid = empid;
	this.empName = empName;
	this.email= email;
	this.salary = salary;
}
}

public class EmployeeManagement {

	public static void main(String[] args) {
		Employee e0 = new Employee(101, "San", "san@gmail.com", 60000.76f);
		Employee e1 = new Employee(134, "Nag", "nag@gmail.com", 75000.34f);
		Employee e2 = new Employee(191, "Vee", "vee@gmail.com", 85000.99f);
		Employee e3 = new Employee(101, "Gur", "gur@gmail.com", 55000.54f);
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e0);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Iterator itr=al.iterator(); 
		while(itr.hasNext()) {
			Employee ed = (Employee)itr.next();
			System.out.println(ed.empid+ " "+ed.empName+" "+ed.email+" "+ed.salary);
		//al.remove(101);
		//System.out.println(ed.empid+ " "+ed.empName+" "+ed.email+" "+ed.salary);
		}
	}

}

