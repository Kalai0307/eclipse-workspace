import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetailaArray {

	public static void main(String[] args) {
		ArrayList<Object> e=new ArrayList<Object>();
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++)
		{
		String name=sc.next();
		e.add(name);
		int age=sc.nextInt();
		e.add(age);
		long phno=sc.nextLong();
		e.add(phno);
		}
		for(Object i:e)
		{
			System.out.println(i+" ");
		}
		
		sc.close();
		
	
		

	}

}
