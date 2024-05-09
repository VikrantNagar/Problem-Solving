import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
    	//Your code goes here
		int min = 0;
		for(int i=0 ; i<arr.length ;i++)
		{
			for(int j=i ;j<arr.length; j++)
			{
				if(arr[i] > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
					
				}
			}
			System.out.print(arr[i] + " ");
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
		selectionSort(arr);
		}
		}

	}

}
