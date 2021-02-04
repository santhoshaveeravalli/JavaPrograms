import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("santhu");
		hs.add("nagendra");
		hs.add("sree");
		hs.add("abbu");
		hs.add("deep");
		hs.add("nag");
		hs.add("nag");
	   Iterator<String> i = hs.iterator();
	   System.out.println("\nHash Set :");
	   while(i.hasNext()) {
		   System.out.println(i.next()); //Ignored Duplicate values
	   }
	   //Elements removed
	   hs.remove("deep");
	   System.out.println("\nAfter elements removed from Hash Set: " +hs);
	   hs.clear();
	   System.out.println("\nCleared Method:" +hs);

	

    //Linked HashList
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.add("santu");
	lhs.add("nag");
	lhs.add("sree");
	lhs.add("abbu");
	lhs.add("deep");
	lhs.add("nag");
	lhs.add("nag");
   Iterator<String> j = lhs.iterator();
   System.out.println("\nLinked Hash Set :");
   while(j.hasNext()) {
	   System.out.println(j.next()); //Ignored Duplicate values
   }

   //TreeSet
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("santu");
	ts.add("nag");
	ts.add("sree");
	ts.add("abbu");
	ts.add("deep");
	ts.add("nag");
	ts.add("nag");
  Iterator<String> k = ts.iterator();
  System.out.println("\nTree Set :");
  while(k.hasNext()) {
	   System.out.println(k.next()); //Ignored Duplicate values
  }
  //Descending Iterator
  System.out.println("\nPrinting in Descending Order");
  Iterator it = ts.descendingIterator();
  while(it.hasNext()) {
	  System.out.println(it.next());
  }
}
}