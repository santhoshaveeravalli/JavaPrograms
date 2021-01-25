import java.util.Scanner;

class Calculation{
	int a;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter Values:");
		a = sc.nextInt();
	}
	
	void Sum(int b, int c)
	{
		System.out.println("Enter B & C values:");
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Sum of the values :"+(b+c));
		
	}
	
	class Multiplication extends Calculation{
		int d;
		void Multip() {
			System.out.println("Enter D value");
			d = sc.nextInt();
		}
			void Product() {
				System.out.println("Multiplication" +(a*d));
				
			
		}
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
       Calculation m = new Calculation();
       m.input();
       m.Sum(2,3);
      

	}

}
