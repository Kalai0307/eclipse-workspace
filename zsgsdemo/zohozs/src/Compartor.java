import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compartor impl {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(305);
		list.add(998);
		list.add(774);
		list.add(236);
		list.add(881);
		/*Collections.sort(list);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("reverse");
		Collections.reverse(list);
		for(Integer i:list)
		{
			System.out.println(i);
		*/
		ComImpl com= new ComImpl();
		Collections.sort(list, com);
		for(Integer i:list)
		{
			System.out.println(i);
		}

	}

}
