import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
public class RemoveDuplicateValues {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ls = new LinkedList();
		System.out.println("Enter n Value:"); 
		int n=sc.nextInt();// Reading number of values 
		System.out.println("Enter Values:");  
		for(int i=0;i<n;i++) {
		ls.add(sc.nextInt());
		}
		//Displaying Linked List
		System.out.println("Elements List:");
		for(int i=0;i<n;i++){
		System.out.println(ls.get(i));	
		}
		HashSet<Integer> hs = new HashSet<Integer>(ls); //Using Hash Set
	    //TreeSet<Integer> ts = new TreeSet<Integer>(ls); // Using Tree Set
		LinkedList<Integer> l = new LinkedList<Integer>(hs);
		System.out.println(l);
		}
	 
}	
/*
		//Removing Duplicates 
		for(int i=0;i<ls.size();i++) 
		{	
			System.out.println("i value:\t" +i);
			for(int j=i+1;j<ls.size();j++)
			{
		    
			    System.out.println("j value:\t" +j);
				if(ls.get(i) == ls.get(j)) 
				ls.remove(j);   	
		    }
	    }
		System.out.println("List after Deleting Duplicate Values:");
			for(int i=0;i<ls.size();i++) 
			System.out.println(ls.get(i));
		*/
		/*Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ls = new LinkedList();
		System.out.println("Enter n Value:"); 
		int n=sc.nextInt();// Reading number of values 
		System.out.println("Enter Values:"); // Reading values 
		for(int i=0;i<n;i++) {
		ls.add(sc.nextInt());
		}
		//Displaying Linked List
		System.out.println("Elements List:");
		for(int i=0;i<n;i++){
		System.out.println(ls.get(i));	
		}
		int deleteCount=0;
		System.out.println("Linked List Size:" +ls.size());
		//Removing Duplicate Elements
		for(int i=0;i<ls.size();i++)
		{
			for(int j=i+1;j<ls.size();j++)
			{
				if(ls.get(i)==ls.get(j))
					ls.remove(j);
			}
		}
		System.out.println("List after Deleting Duplicate Values:");
			for(int i=0;i<ls.size();i++) 
			System.out.println(ls.get(i));
	*/
		/*LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
					list.remove(j);
			}
		}
		System.out.println(list);

	}
		}
*/



	

	
		
	

