import java.util.Scanner;

class Add1{
	void Addi(int a1, int b1) {
		System.out.println("Sum ="+(a1+b1));
	}
	void Addi(float a1) {
		System.out.println("Value = "+a1);
		
	
	}
}
public class Methodoverloading2 {

	public static void main(String[] args) {
		Add1 ad = new Add1();
				Scanner sc = new Scanner(System.in); {
		System.out.println("Enter Values:");
		ad.Addi(sc.nextFloat());;
				}
	}

}
