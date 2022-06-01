package VidhinSanAssign;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=0;i<n;i++){
	for(int j=n-i;j>0;j--)
	{
		System.out.print("*");
	}
	System.out.println();
	
	
}
for(int k=1;k<=n-1;k++)
{
	for(int l=0;l<=k;l++)
	{
		System.out.print("*");
	}
	System.out.println();
}

	}

}
