import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
    
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
			+ quantity + "]";
}   

}    
public class HshMapDemo {

	public static void main(String[] args) {
/*/*	HashMap<Integer,String> hm= new HashMap<Integer,String>(); 
	hm.put(10,"kalai");
	hm.put(2,"vani");
	hm.put(100,"Amit");    
    hm.put(101,"Vijay");    
    //hm.put(101,"Rahul");  
  //   hm.compute(1,"ghj");
    hm.remove(10, "kalai");
    hm.remove("vani");
    hm.replaceAll((k,v)->"Ajay");
	for(Entry<Integer, String> m:hm.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}*/
		Map<Integer,Book> map=new HashMap<Integer,Book>();    
	    //Creating Books    
////		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
////	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
////	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);     
//	    //Adding Books to map   
//	    map.put(1,b1);  
//	    map.put(2,b2);  
//	    map.put(3,b3);  
//	    System.out.println(map.toString());  
//	    //Traversing map  
//	    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
//	        int key=entry.getKey();  
//	        Book b=entry.getValue();  
//	        System.out.println(key+" Details:"); 
//	       
	        
	    }

	}

	

}
