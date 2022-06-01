package zsgsdemo;
import java.io.*;

class Demo
{
	private int Capcity;
	//public int setcapcity;
//	public int setCapcity;

	public int getCapcity() {
		return Capcity;
	}

	public void setCapcity(int capcity) {
		this.Capcity = capcity;
	}

}

public class DteDemo {

	public static void main(String[] args)  {
		/*String pattern = "HH:m:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse("22:0:03");
		System.out.println(date);*/
		Demo obj= new Demo();
		obj.setCapcity(5);
		System.out.println(obj.getCapcity());
		
	}

}
