import java.util.Collections;

public class QuickSort {

	public static void main(String[] args) {
		
		int array[]= {5,8,52,7,3,2,9,11};
		
		
	//	int length= array.length;
		int end = array.length;
		int i=array[1];
		int j=array[end-1];
		
		quicksort(array,i,j);
		
	}	
	

	public static void quicksort(int[] array, int i,int j) {
		int pivot =array[0];
		int end =j;
		int temp;
		while(i<j)
		{
			while(i<=end &&array[i]<pivot)
			{
				i++;
			}
			while(j>=0 &&array[j]>pivot)
			{
				j--;
			}
			
			
		}
		if(i<j&&i<=end)
		{swap(array,i,j);
		}
		swap(array,pivot,j);
		quicksort(array,pivot,j-1);
		
		quicksort(array,j+1,end);
		for(int k=0;k<end;k++)
		{
			System.out.println(array[k]);
		}
		
	}


	public static void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}

}
