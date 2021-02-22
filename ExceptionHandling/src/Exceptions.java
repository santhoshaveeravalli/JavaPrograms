
public class Exceptions extends Throwable {

	public static void main(String[] args) {
		
		int a=100,b=0,c;
		String s= null;
		
		try {
			System.out.println(s.length());
			String s1="abc";  
			int i=Integer.parseInt(s1);//NumberFormatException 
			c=a/b;
			
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Arithematic exception found" +e);
		}
		
		catch(NullPointerException np){
			System.out.println("Null Pointer exception found");
		}
		
		catch(NumberFormatException nf)
		{
			System.out.println("Number format exception is found" +nf);
		}
	}
}
