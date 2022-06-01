import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []numbers= new int [5];
		for(int i=0;i<5;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("before sorting");
		printarray(numbers);
		mergesort(numbers);
		System.out.println("after sorting");
		printarray(numbers);
	
	}

	private static void mergesort(int[] inputArray) {
		// TODO Auto-generated method stub
		int length= inputArray.length;
		if(length<2)
		return;
		int midpoint= length/2;
		int leftHalf[]=new int [midpoint];
		int rightHalf[]=new int [length-midpoint];
		for(int i=0;i<midpoint;i++)
		{
			leftHalf[i]=inputArray[i];
		}
		
		for(int i=midpoint;i<length;i++)
		{
			rightHalf[i-midpoint]=inputArray[i];
		}
		
		mergesort(leftHalf);
		mergesort(rightHalf);
		merge(inputArray,leftHalf,rightHalf);
		
		
	}

	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		// TODO Auto-generated method stub
		int leftSize=leftHalf.length;
		int rightSize=rightHalf.length;
		int i=0,j=0,k=0;
		while(i<leftSize&&j<rightSize)
		{
			if(leftHalf[i]<=rightHalf[i])
			{
				inputArray[k]=leftHalf[i];
				i++;
			}
			else
			{
				inputArray[k]=rightHalf[j];
				j++;
			}
			k++;
				
		}
		while(i<leftSize)
		{
			inputArray[k]=leftHalf[i];
			i++;k++;
		}
		while(j<rightSize)
		{
			inputArray[k]=rightHalf[j];
			j++;
			k++;
		}
		
	}

	private static void printarray(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}

}
