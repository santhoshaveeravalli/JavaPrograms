package ContactListPackage;
import java.util.*;
import java.util.Map.Entry;

public class ContactList {
HashMap<String,Integer> hmcontacts = new HashMap<String,Integer>();
   void addContact(String name,Integer no){
	   hmcontacts.put(name,no);
   }
 
 public boolean searchNo(Integer no) {
	   Set<Entry<String,Integer>> s =  hmcontacts.entrySet(); 
	   Iterator<Entry<String,Integer>> it = s.iterator();
	   while (it.hasNext()) {
			Map.Entry<String,Integer> m = it.next();
			if (m.getKey().equals(no)) {
			return true;
			}
		}
		
		return false;
	}
	   
   
  public boolean searchName(String name) {
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
   
  public void listAllContacts() {
		Set<Entry<String,Integer>> s = hmcontacts.entrySet();
		Iterator<Entry<String,Integer>> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry<String,Integer> m = it.next();
			System.out.println(m);
		}
	}
   }
   
