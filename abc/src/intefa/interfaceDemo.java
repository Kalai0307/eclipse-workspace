/**
 * 
 */
package intefa;

/**
 * @author dell1
 *
 */
interface polygon
{
void area();
}
interface triangle 
{
void area();
}

class rectangle implements polygon,triangle
{
	int l,b;
	public rectangle(int i, int j) {
		this.l=i;
		this.b=j;
	}
	
	public void area()
	{
		System.out.println(l*b);
	}
	
}

public interface interfaceDemo {
	public static void main( String args[])

	{
		rectangle obj =new rectangle(5,8);
		obj.area();
		
		
	}

}

