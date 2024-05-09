import java.util.Scanner;

public class SecondLargestInArray {
	
	 public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
		 int max = Integer.MIN_VALUE;
		 int secMax = Integer.MIN_VALUE;
		 for(int i=0 ;i<arr.length ; i++) {
			 if(arr[i]>max) {
				secMax = max;
				max = arr[i];
				
			 }
				else if (arr[i] > secMax && arr[i] !=max) {
				 secMax = arr[i];
			 }
		 }
		 
		 return secMax;
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
		System.out.print(secondLargestElement(arr));
		}
		}

	}

}
