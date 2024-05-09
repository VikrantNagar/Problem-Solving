import java.util.Arrays;
import java.util.Scanner;

public class TripletSumInArray {
	
	public static int pairSum(int arr[], int num) {
		
		Arrays.sort(arr);
		int n = arr.length;
		int count = 0;
		for(int i=0 ; i<n ; i++) {
			int k = num-arr[i];
			
			int low = i+1;
			int high = n-1;
			while(low<high) {
				
				if(arr[low] + arr[high] < k) {
					low++;
				}
				else if(arr[low]  +arr[high] > k) {
					high--;
				}
				else {
					
					count++;
					//low++;
					high--;
				}
			}
		}
		
		return count;
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
		int X = s.nextInt();
		System.out.print(pairSum(arr,X));
		}
		}


	}

}
