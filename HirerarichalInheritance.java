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
	 void lab1() {
		 System.out.println("Computer Lab");
	 }
 }
 class Ece extends Clg{
	 void lab2() {
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
	cs.input();
	cs.lab1();
	Ece ec = new Ece();
	ec.input();
	ec.lab2();
	Otherdept od = new Otherdept();
	od.input();
	od.lab();  
    Clg c = new Clg();
    c.clg_code = 1001;
    System.out.println("College Code:" +c.clg_code);
	

	}

}
