package VidhinSanAssign;

public class Electronics {

	public static void main(String[] args) {
		int keyboards[]= {4};
		int drives[]= {5};
		int sum=0,max=0,max2=0;;
		int b=5;
		for(int i=0;i<keyboards.length;i++)
		{
			for(int j=0;j<drives.length;j++)
			{
				sum=keyboards[i]+drives[j];
				System.out.println("sum"+sum);
				
				if(sum>max&&sum<b)
				{
					max=sum;
					System.out.println("max"+max);
				}
				else
					{
					max=sum;
					}sum=0;
			}
			}
			
			
		if(max<b)
		{
			System.out.println(max);
		}
		else
			System.out.println(-1);

	}

}
