import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows to print Pascal Triangle:");
		int rows = sc.nextInt();
		for(int i=0; i<=rows;i++) { 
			//Printing Spaces in Pascal Triangle
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			//Printing numbers in Pascal Triangle
			int number=1; // First and last number should print 1 
			for(int k=0;k<=i;k++) {
				System.out.print(number + " ");
				number = number*(i-k)/(k+1); //Formula for Pascal Triangle
			}
			System.out.println(" ");
		}

	}

}
