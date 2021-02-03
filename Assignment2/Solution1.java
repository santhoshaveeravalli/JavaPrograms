class Calculator{
	static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
		}
	static double powerInt(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}
public class Solution1 {

	public static void main(String[] args) {
		int a;
		double b;
		a = Calculator.powerInt(10, 2);
		b= Calculator.powerInt(10.1, 2.0);
		System.out.println(a);
		System.out.println(b);

	}

}
