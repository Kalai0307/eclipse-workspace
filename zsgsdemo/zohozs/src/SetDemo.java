import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

 
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//linkedhashset
		//hash set
		//tree set
		
		LinkedHashSet<Object> ll= new LinkedHashSet<>();
		ll.add(1);//hetro
		ll.add(2);// no duplicate
		ll.add(3);// order maintain panum
		ll.add(2);
		ll.add("kalai");
		System.out.println("linked hash set"+ll);
		
		// lined hash map
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<>();
		LinkedHashMap<Integer, String> lm1=new LinkedHashMap<>();
		lm1.put(1,"kalai");
		lm.put(1,"kalai");
		lm.put(1,"kalai");//no duplicate
		lm.put(2,"vani");//order maintain panum
		lm.put(1,"brindha");
		System.out.println(lm);
		System.out.println(lm.get(2));//vani
		System.out.println(lm.containsValue("vani"));//true
		System.out.println(lm.equals(lm1));//false
		
		System.out.println("======================================================================================");
		
		System.out.println("TREE SET AND TREE MAP");
		// sorting
		TreeSet<String> ts=  new TreeSet<String>();
		ts.add("kalai");
		ts.add("vani");
		ts.add("mini");
		ts.add("dulcy");
		System.out.println("tree set"+ts);
		System.out.println(ts.first());//dulcy
		System.out.println(" sdfghj"+ts.toString());
		System.out.println(ts.pollLast());
		
		TreeMap<Integer,String> tm= new TreeMap<>();
//		Book b = new Book(1,"sandling");
//		Book b1 = new Book(2,"handling");
//	
//		tm.put(1, b1);
//		tm.put(2, b);
//		System.out.println(tm);
		tm.put(5, "kalai");
		tm.put(1, "kalaivani");
		tm.put(2, "sam");
		tm.put(6, "mini");
		System.out.println(tm);
		System.out.println(tm.descendingMap());//decending order
		System.out.println(tm.descendingKeySet());//printimg only key set
		System.out.println(tm.getClass());//print the tree map pacakage
	//	
		System.out.println("=======================================");
		System.out.println("hASH MAP AND HASH SET");
		Map<Integer,String>hm=new HashMap<>();
		hm.put(null,"kalsi");
		hm.put(1,"kalsi");
		hm.put(7,"kalsi123");
		hm.put(12,"kalsi852");
		hm.put(122,"kalsi852");
		hm.put(128,"ka52");
		hm.put(124,"kals2");
		hm.put(1288,"ksi852");
		
		System.out.println(hm);
		System.out.println(hm.putIfAbsent(1, null)); // outpit null,if i ku put la value assign panuna athu kalsi return pan
		
		
		HashSet<Integer>has= new HashSet<>();
		has.add(1);
		has.add(9);// no in
		has.add(20);
		has.add(11);
		System.out.println(has);
		
		
		
		
		
	}

}
