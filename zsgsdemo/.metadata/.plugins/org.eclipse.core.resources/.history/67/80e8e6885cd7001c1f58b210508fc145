import java.util.Scanner;

public class SwapArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("number of elements=");
		int n = sc.nextInt();
		int array[]=new int [n];
		System.out.println("inserting element in an array");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("printing array before swapping");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("elements to be swapped");
		int index1=sc.nextInt();
		int index2=sc.nextInt();
		swap(array,index1,index2);
		System.out.println("elements after swapping");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}

	}

	public static int[] swap(int[] array, int index1, int index2) {
		int temp;
		temp=array[index1];
		System.out.println(array[index1]);
		array[index1]=array[index2];
		array[index2]=temp;
		return array;
		
	}

}
