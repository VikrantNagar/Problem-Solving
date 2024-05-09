import java.util.Scanner;

public class RotateAnArray {
	
	public static void swap(int arr[], int l , int r) {
		int temp ;
		temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	
	public static void rotateBetween(int arr[], int l, int r) {
		r--;
		int len = (r-l)/2;
		for(int i = 0 ; i<=len ; i++) {
			swap(arr, l, r);
			l++;
			r--;
		}
	}
	
	public static void reverse(int arr[], int x, int n) {
	
		rotateBetween(arr,0,n);   //54321
		rotateBetween(arr,0,n-x); //34521
		rotateBetween(arr,n-x,n);  //34521
		
	}
	
	public static void rotateArray(int arr[], int x) {
		
		int n = arr.length;
		x = x%n;
		if(x>0) {
			reverse(arr, x, n);
		}
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int X = s.nextInt();
		int arr[] = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		rotateArray(arr, X);
	}

}
