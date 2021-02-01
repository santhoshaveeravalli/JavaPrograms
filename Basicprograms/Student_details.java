class Student {
	int id;
	String dept_name;
	int dept_id;
	static String clg_name;
	}

public class Student_details {

	public static void main(String[] args) {
		Student.clg_name="University";
		
		Student santhu = new Student(); // First Object is created for Student class
		santhu.id=54;
		santhu.dept_name="Computer Science";
		santhu.dept_id=05;
		
		Student deepthi = new Student(); // Second Object is created for Student class 
		deepthi.id = 45;
		deepthi.dept_name="Electronics";
		deepthi.dept_id=04;
		
		System.out.println("ID:" +santhu.id);
		System.out.println("Department Name:" +santhu.dept_name);
		System.out.println("Department Id:" +santhu.dept_id);
		System.out.println("College Name:" +Student.clg_name);
		
		System.out.println("ID:" +deepthi.id);
		System.out.println("Department Name:" +deepthi.dept_name);
		System.out.println("Department Id:" +deepthi.dept_id);
		System.out.println("College Name:" +Student.clg_name);
	}

}
