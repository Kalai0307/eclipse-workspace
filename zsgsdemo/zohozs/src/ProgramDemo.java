import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) {
		
		//String s="program";
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		sc.close();
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||(i+j)==(n-1))
						{
					System.out.print(s.charAt(j));
						}
				else
					System.out.print(" ");
			}
			System.out.println("\n");
		}
	}

}
