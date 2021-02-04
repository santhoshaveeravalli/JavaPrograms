import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ListProgram {

	public static void main(String[] args) {
		//ArrayList
		 ArrayList<String> l=new ArrayList<String>();  
		  l.add("Santhu");  
		  l.add("Nagendra");    
		  l.add("Sree");    
		  l.add("Abbu");    
		  Iterator ir=l.iterator();
		  while(ir.hasNext()){
		   System.out.println(ir.next());  
	}
		  //Traversing 
		  for(int i=0;i<l.size();i++) {
			  System.out.println(l.get(i));
		  }
		  //LinkedList
		  LinkedList<String> a=new LinkedList<String>();  
		  a.add("Cse");  
		  a.add("Ece");  
		  a.add("civil");  
		  a.add("Aero");  
		  Iterator<String> i=l.iterator();  
		  System.out.println("\nLinked List:");
		  while(i.hasNext()){  
		   System.out.println(i.next()); 
		  }
		  //Stack
		  
	        Stack s1 = new Stack(); 
	        Stack<String> s2 = new Stack<String>(); 
	        s1.push(1993); 
	        s1.push("a"); 
	        s1.push("b"); 
	        s2.push("c"); 
	        s2.push("d"); 
	        s2.push("f"); 
	        s1.push(1009);
	        System.out.println(s1); 
	        System.out.println(s2); 
	        s1.pop();
	        System.out.println(s1);
	        
	}
}
