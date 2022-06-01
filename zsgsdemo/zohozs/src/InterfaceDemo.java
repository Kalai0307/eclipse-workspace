

//import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;

interface Parent
{
	  void print();
	
	void anau();
	
	
}
interface Stepparent 
{
void printkalai();
	
	void anaukalai();
}

class Child implements Parent,Stepparent
{   
	public void print()
	{
		System.out.println("child");
	}
	public void anau()
	{
		System.out.println("zsdf");
	}
	public void van()
	{
		System.out.println("van");
	}
	@Override
	public void printkalai() {
		System.out.println("pkalai");
		
	}
	@Override
	public void anaukalai() {
	System.out.println("akalai");
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Child c= new Child();
		c.print();
		c.anau();
		c.van();
		c.anaukalai();
		Parent p= new Parent() {

			@Override
			public void print() {
				System.out.println("kalai");
				
			}

			@Override
			public void anau() {
				// TODO Auto-generated method stub
				
			}
			
		};
			
		p.print();
	
	
	}

}
