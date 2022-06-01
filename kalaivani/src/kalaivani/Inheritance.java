package kalaivani;

class Animal
{
	String name;
	
public void eat()

{
	System.out.println("name is "+name);
}
class Labradour extends Animal
{ String cou;
	public void colour()
	{
		System.out.println("colour is ="+cou);
	}

}
}

public class Inheritance {
	public static void main(String[]args)
	{
		Labradour obj= new Labradour();
		obj. cou =" browny";
		obj.colour();
		obj.eat();
		
		
		
		
		
		
		
	}

}
