import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class ContactLists{
	HashMap<String,Integer> hmcontacts = new HashMap<String,Integer>();
	   void addContact(String name,Integer no){
		   hmcontacts.put(name,no);
	   }
	 
	 boolean searchNo(int no) {
		   Set<Entry<String,Integer>> s =  hmcontacts.entrySet(); 
		   Iterator<Entry<String,Integer>> it = s.iterator();
		   while (it.hasNext()) {
				Map.Entry<String,Integer> m = it.next();
				if (m.getValue()== no) {
				return true;
				}
			}
			
			return false;
		}
		   
	   
	  boolean searchName(String name) {
	   Set<Entry<String,Integer>> s =  hmcontacts.entrySet(); 
	   Iterator<Entry<String,Integer>> it = s.iterator();
	   while (it.hasNext()) {
			Map.Entry<String,Integer> m = it.next();
			if (m.getKey().equals(name)) {
			return true;
			}
		}
		
		return false;
	}
	   
	  void listAllContacts() {
			Set<Entry<String,Integer>> s = hmcontacts.entrySet();
			Iterator<Entry<String,Integer>> it = s.iterator();
			while (it.hasNext()) {
				Map.Entry<String,Integer> m = it.next();
				System.out.println(m);
			}
	  }
	  }

public class Contacts {

	public static void main(String[] args) {
		ContactLists CL = new ContactLists();
		CL.addContact("Hyderabad" , 957322778);
		CL.addContact("Telugu" , 897822334);
		CL.addContact("Andhra", 765645342);
		CL.addContact("India", 678954321);
		System.out.println("India: " + CL.searchName("India"));
		System.out.println("678954321: " + CL.searchNo(678954321));
		System.out.println("San: " + CL.searchName("San"));
		System.out.println();
		CL.listAllContacts();
	}

}
