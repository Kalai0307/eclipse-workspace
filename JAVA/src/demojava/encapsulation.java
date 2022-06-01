package demojava;

public class encapsulation {
	public static void main(String[]args)
	{
		labours e1=new labours();
		e1.setName("mini");
		e1.setRollno(101);
		System.out.println(e1.getName());
	/*	labours e2=new labours();
		e2.name="micky";
		e2.rollno=102;
		e2.sample();*/
		
	}

}
class labours
{
	private String Name;
    private int Rollno;
   // public void sample()
  //  {
   // 	System.out.println(name);    	
   // 	System.out.println(rollno);  
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		this.Rollno = rollno;
	}
    	
   // }
    



}