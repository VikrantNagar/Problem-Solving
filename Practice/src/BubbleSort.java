import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
    	//Your code goes here
		
		int swap = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			
			for(int j=0 ; j<i ; j++) {
				if(arr[j]>arr[j+1]) {
					
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		
		bubbleSort(arr);
		
		}
}
