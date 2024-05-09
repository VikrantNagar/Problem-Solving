import java.util.Arrays;
import java.util.Scanner;

public class PairSumInArray {
	
	public static int pairSum(int[] arr, int num) {
		
		Arrays.sort(arr);
		int c = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
		      int x = num - arr[i];
		      int y = lowerBound(arr, i + 1, n, x);
		      int z = upperBound(arr, i + 1, n, x);
		      c = c + z - y;
		    }
		    return c;
	}
	
	public static int lowerBound(int[] arr, int start,
            int end, int key)
	{
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < key) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return start;
	}

// upperBound implementation
	public static int upperBound(int[] arr, int start,
            int end, int key)
	{
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] <= key) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return start;
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
