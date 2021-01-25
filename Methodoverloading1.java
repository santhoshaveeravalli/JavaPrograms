import java.util.Scanner;

class Add{
	void addition(float a, float b) {
		System.out.println("Sum = "+(a+b));
	}
	void addition(int a, float b, int c) {
		System.out.println("Sum ="+(b+c));
	}
}
public class Methodoverloading1 {

	public static void main(String[] args) {
		Add ad = new Add();
				Scanner sc = new Scanner(System.in); {
					System.out.println("Enter Values:");
					ad.addition(sc.nextInt(),sc.nextFloat(),sc.nextInt());
					
				}			
	}}


