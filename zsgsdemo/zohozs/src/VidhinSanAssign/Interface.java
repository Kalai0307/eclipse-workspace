package VidhinSanAssign;
interface A
{
    public void display();
    
}
interface B
{
    public void display();
}

class C implements A,B
{
     public void display()
     {
         System.out.println("dislpay A");
     }
     public void display1()
     {
         System.out.println("display B");
     }
}
public class Interface {

	public static void main(String[] args) {
		 C c= new C();
         c.display();
         c.display1();
	
	}

}
