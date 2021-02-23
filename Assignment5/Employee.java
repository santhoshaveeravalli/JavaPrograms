package Assignment5;
import java.io.Serializable;

public class Employee implements Serializable {
	String name;
	String dob;
	String department;
	String designation;
	double salary;
	
	String getName() {
		return name;
	}
    void setName(String name) {
		this.name = name;
	}
	String getDob() {
		return dob;
	}
	void setDob(String dob) {
		this.dob = dob;
	}
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	
}