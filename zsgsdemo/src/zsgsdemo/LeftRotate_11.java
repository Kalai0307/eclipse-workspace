package zsgsdemo;

public class LeftRotate_11 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n = a.length;
		System.out.println("numof ele"+n);
		int temp = 0;
		
          int p=2;
		while(p>0)
		{
			temp =a[0];
		for(int i=0;i<n-1;i++)
		{
			
			a[i]=a[i+1];
			
		}
		a[n-1]=temp;
		p--;
		}
		for(int i=0;i<n;i++)
		
		{
		System.out.println(a[i]);
		}
	}

}
