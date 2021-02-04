import java.util.Scanner;

class StringEx{
		
	StringEx(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Display entered String:" +str);
		//Contains method
		System.out.println("Enter S0 String:");
		String s0 = sc.nextLine();
		boolean st = str.contains(s0);
	    System.out.println("Contains "+st);
	    //Concat Method
	    System.out.println("Enter Second String");
	    String str1 = sc.nextLine();
	    String Concatstr = str.concat(str1);
	    System.out.println("Concate String:" +Concatstr);
	    //Compare Method
	    boolean st1= str.equals(str1);
	    System.out.println(st1);
	    //uppercase
	    String x = str.toUpperCase();
	    System.out.println(x);
	    //lowercase
	    String y = str1.toLowerCase();
	    System.out.println(y);
	    //split
	    String[] s2 = str.split(" ");
	    for(String w:s2){  
	    	System.out.println(w);  
	    	}  
	    //Length
	    int len = str.length();
	    int len1 = str1.length();
	    System.out.println("Length of the String Str:" +len);
	    System.out.println("Length of the String Str1:" +len1);
	    //Substring
	    String str3 = str.substring(5);
	    System.out.println(str3);
	    
	}
	
	
}
public class StringSampleProgram {

	public static void main(String[] args) {
		StringEx se = new StringEx();
		//se.stringMethod();
		
		
		
	
				
				

	}

}
