

public class FatherChild {

	public static void main(String[] args) {
	
		String[][] names = {{"like","shaw"},
				{"wayne","rooney"},
				{"rooney","ronaldo"},
				{"shaw","rooney"},};
		String UserInput="ronaldo";
		String DadName = "";
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(UserInput == names[i][j])
				{
					 DadName=names[i][j-1];
				}
				
			}
		}
		System.out.println(DadName);
		
		int count=0;
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<2;j++)
			{
				if(DadName == names[i][j])
				{
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
		
			
				
		
		

	}

}
