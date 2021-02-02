import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		String s, rev = "";
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any string:");
		s = in.nextLine();
		char[] c = s.toCharArray();
		for(i=c.length-1; i>=0; i--) {
			rev = rev + c[i];
		}
	       if(s.equals(rev)) {
	    	   System.out.println("Entered string is palindrome");
	    	   System.out.println("True");
	    	   
	       }
	       else {
	    	   System.out.println("Entered string is not palindrome");
	    	   System.out.println("False");
	       }
	}

}
