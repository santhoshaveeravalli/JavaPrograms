package Assignment5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import Assignment5.Employee;

public class Assignment5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(sc.nextLine());
		System.out.print("Enter department: ");
		emp.setDepartment(sc.nextLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		FileOutputStream fos = new FileOutputStream("C:/Users/santh/Desktop/JavaPrograms/JavaPrograms/Assignment5.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
		FileInputStream fis = new FileInputStream("C:/Users/santh/Desktop/JavaPrograms/JavaPrograms/Assignment5.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
	}
}