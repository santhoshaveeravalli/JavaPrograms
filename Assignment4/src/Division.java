import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int quotient=0,sign;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dividend value: ");
		int dividend = sc.nextInt();
		System.out.println("Enter the divisor value: ");
		int divisor = sc.nextInt();
		if(divisor ==0) {
			System.out.println("Can't divide by 0 i.e; Infinity");
		}
		if((dividend < 0) | (divisor <0)) {// if the dividend or divisor less than zero then it is a negative value
			sign = -1;
		}	
		else {
			sign =1;
		}
		dividend = Math.abs(dividend);
	    divisor= Math.abs(divisor);
		while(dividend>=divisor)
		{
			dividend= dividend-divisor;
			quotient++;
		}
		
		int squo = sign * quotient;	
		
		System.out.println("The quotient is "+squo);
		System.out.println("The remainder is " +dividend);
	}
}