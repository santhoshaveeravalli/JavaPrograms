import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapPrograms {

	public static void main(String[] args) {
		Map map = new HashMap();
		//adding elements to map
		map.put(18, "Wed");
		map.put(93,"San");
		map.put(90, "Nag");
		map.put(17, "Eng");		
		//traversing
		Set s = map.entrySet();// Converting to Set to traverse
		Iterator it = s.iterator();
		while(it.hasNext()) {
			//Converting to Map.Entry to print key and values separately
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+" "+me.getValue());
					}
		//Linked Hash Map 
	    Map<Integer,String> mp = new LinkedHashMap<Integer,String>();
	    mp.put(12, "Twelve");
	    mp.put(90, "Ninety");
	    mp.put(75, "Seventy Five");
	    mp.put(55,"fifty five");
	    System.out.println(mp);
	    mp.remove(90);
	    System.out.println(mp);

	//Tree Map
	    NavigableMap<Integer,String> nm=new TreeMap<Integer,String>();    
	      nm.put(41,"A");    
	      nm.put(21,"R");    
	      nm.put(11,"V");    
	      nm.put(31,"H");    
	      //Maintains descending order  
	      System.out.println("descendingMap: "+nm.descendingMap());  
	      //returns less than or equal to specified key  
	      System.out.println("headMap: "+nm.headMap(21,true));  
	      //returns greater than or equal to the specified key 
	      System.out.println("tailMap: "+nm.tailMap(11,true));  
	      //returns key between the specified key
	      System.out.println("subMap: "+nm.subMap(11, false, 31, true));   
	 
	
	    }
}