import java.util.Scanner;

public class RecursionBinarySearch {
	public static int BinarySearch(int arr[], int si, int ei, int x) {
		
		if(si > ei) {
			return -1;
			
		}
		int midIndex = (si + ei)/2;
		if(arr[midIndex] == x) {
			return midIndex;
		}else if(arr[midIndex] < x) {
			return BinarySearch(arr, midIndex+1, ei, x);
		}else
			return BinarySearch(arr, si, midIndex-1, x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		int si = s.nextInt();
		int ei = s.nextInt();
		int x = s.nextInt();
		System.out.print(BinarySearch(arr, si, ei, x));
		

	}

}
