package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashArray {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("sunil", "sahana");
		ArrayList<HashMap<String, String>> arl = new ArrayList<HashMap<String, String>>();
		arl.add(hm);// TODO Auto-generated method stub
		System.out.println(arl);
		ArrayList<String> ar = new ArrayList<>();
		ar.add("kalai");
		
		HashMap<String, ArrayList<String> > h = new HashMap<String, ArrayList<String> >();
  h.put("vani", ar);
  for(Map.Entry<String,ArrayList<String>> m:h.entrySet())
  {
	  System.out.println(m.getKey()+m.getValue());
  }
	}

}
