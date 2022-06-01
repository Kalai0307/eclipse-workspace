
import java.util.Comparator ;
public class ComImpl  implements Comparator <Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1%100>o2%100)// o1>o2-->ascending.o1<o2--> descending
		{
			return 1;
			
		}
		return -1;
	}

	
	

}
