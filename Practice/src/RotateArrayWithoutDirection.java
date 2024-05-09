import java.util.Scanner;

public class RotateArrayWithoutDirection {


	public static void swap(int a[], int l, int r) {
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
	public static void reverseBetween(int a[], int l, int r) {
		r--;
		int len = (r-l)/2;
		for(int i=0; i<=len; i++) {
			swap(a,l,r);
			l++;
			r--;
			
		}
	}
	public static void rotateLeft(int[] a, int n, int x) {
		
		reverseBetween(a,0,n);
		reverseBetween(a,0,n-x);
		reverseBetween(a,n-x,n);
	}
	public static void rotateArray(int []a, int x) {
        // Write your code here.
		
		int n = a.length;
		if(n>0) {
		x = x%n;
		if(x>0) {
			rotateLeft(a,n,x);
		}
		for(int i = 0; i<n ; i++) {
			System.out.print(a[i]+ " ");
		}
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		if(N>=0) {
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		int X = s.nextInt();
		if(X>0) {
		rotateArray(arr, X);
		}
		}
		}

	}

}
