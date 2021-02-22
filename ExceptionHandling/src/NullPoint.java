
public class NullPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try 
	{  
	  String s= null;  
	  System.out.println(s.length());  
	}  
	catch(NullPointerException e)
	{
		System.out.println("Null pointer exception is found " +e);
	}  
	finally
	{
		System.out.println("finally block is executed");}  
	     	   			
	}




}


