import java.util.Scanner;

class Clg{
	String dept;
	int dept_code;
	static int clg_code;
	Scanner  sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter Department names:");
		dept = sc.nextLine();
		System.out.println("Enter department code");
		dept_code = sc.nextInt();
	}
}
 class Cse extends Clg{
	 void lab() {
		 System.out.println("Computer Lab");
	 }
 }
 class Ece extends Clg{
	 void lab() {
		 System.out.println("Electronics Lab");
	 }
 }
 class Otherdept extends Clg{
	 void lab() {
		 System.out.println("Library is common for all departments");
	 }
 }
public class HirerarichalInheritance {

	public static void main(String[] args) {
		
	Cse cs = new Cse();
	Ece ec = new Ece();
	Otherdept od = new Otherdept();
	cs.lab();
	ec.lab();
	od.lab();  
	Clg c = new Clg();
	c.input();
	

	}

}
