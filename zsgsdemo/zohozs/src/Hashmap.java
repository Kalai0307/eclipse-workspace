import java.io.*;
import java.util.*;
import java.util.Map.Entry;
  
class Book
{
	int id;    
	String name,author,publisher;    
	int quantity;  

	public Book(int i, String string) {
		   id = i;    
		    name = string;    
		    author = string2;    
		    publisher = string3;    
		    quantity = j;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	

}
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();//Creating HashMap    
		   hm.put(1,"Mango");  //Put elements in Map  
		   hm.put(2,"Apple");    
		   hm.put(3,"Banana");   
		//   map.put(4,"Grapes");
		 //  map.put(5, "kalai");
		   System.out.println(hm.get(2));//priting value using key
		   System.out.println(hm.containsValue("apple"));// check and return true or false
		//   System.out.println(hm.equals(2));
		   for(Entry<Integer, String>  m:hm.entrySet() )
		   {
			   System.out.println(m.getValue()+" "+m.hashCode()+" "+m.getKey());
		   }
		   Map<Integer,Book> map=new HashMap<Integer,Book>();    
		   Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
		    map.put(0,b1);
            map.put(1, b2);
            for(Entry<Integer, Book> k:map.entrySet())
            {
            	System.out.println(k.toString());
            }
	

}
}