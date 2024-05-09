import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
    	//Your code goes here
		int swap;
		for(int i=1 ; i<arr.length ; i++)
		{
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
						
			}
			arr[j+1] = temp;
			
		}
		
		}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		if(N>0) {
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		insertionSort(arr);
		}
		}

	}

}
