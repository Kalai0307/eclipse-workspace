package zsgsdemo;

public class Demo1
{

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c=11;
		int d=checking(a,b,c);
		System.out.println(d);
	}

	public static int checking(int a, int b,int c) {
		return (a>b)&&(a>c)?a:(b>a)&&(b>c)?b:c;
		
		
		
	}

}
