package alphademo;

class Pttern
{
	public void demo()
	{char c='e';
		for(int i=0;i<5;i++)
		{
		for(int j=i;j<5;j++)
		{
			System.out.print(c);}
		c--;
		System.out.println();
		}
		
	}
}

public class AlphaPattern_5 {

	public static void main(String[] args) {
		Pttern ob=new Pttern();
		ob.demo();
	

	}

}
