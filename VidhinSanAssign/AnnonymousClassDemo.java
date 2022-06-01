package VidhinSanAssign;


class calling
{
	public void call()
	{
		System.out.println("calling via smartphone");
	}
	}
public class AnnonymousClassDemo {

	public static void main(String[] args) {
		calling p=new calling();
		
		
		 calling c=new calling()
				 {
			        public void call()
			        {
			        	System.out.println("calling via whatsapp call");
			        }
				 };
		c. call();
		p.call();
			
		
		 
		

	}

}
