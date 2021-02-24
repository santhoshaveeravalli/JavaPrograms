
class MySql{
	 static {
	    	System.out.println("Static Mysql Block");
	    }
}
class Oracle
{
	 static 
	 {
	    	System.out.println("Static Oracle Block");
	 }
	 Oracle(){
		 System.out.println("Oracle Constructor");
	 }
}
public class ForNameDemo {
   	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
   			System.out.println("Static Method");
			Class.forName("MySql");
			Class c = Class.forName("Oracle");
			System.out.println(c.getName());
			c.newInstance();
		
	}

}
