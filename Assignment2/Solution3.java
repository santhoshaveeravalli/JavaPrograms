import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		String S;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String:");
		S=in.nextLine();
		char c[]= S.toCharArray();
		if(c[0] == ' ')
		{
			System.out.print(c[1]);  
		}
		else
		{
			System.out.print(c[0]);
		}
		for(int i=1; i<c.length-1 ; i++) {
			if(c[i] ==' ' && c[i+1] != ' ') {
					System.out.print(c[i+1]);
	        }
		}
	}
				
}		
		

	


