import java.util.Scanner;

class SignedReverse {
    public String reverse(long x) {
        String rev = "0";
        
        long maxvalue =  2147483647, minvalue = -2147483647;
        if(x >maxvalue || x<minvalue) { return rev;}
        else
        {
        	String s=String.valueOf(x);
            StringBuilder input1 = new StringBuilder();
            input1.append(s);
            input1.reverse();
    		System.out.println("Value:"+input1);
    		rev=input1.toString();
        }
         return rev;
    }
    
}
public class ReverseProgram {

	public static void main(String[] args) {
		SignedReverse sr = new SignedReverse();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Integer");
		System.out.println(sr.reverse(in.nextLong()));
	}
		
	}
