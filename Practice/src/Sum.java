import java.util.Scanner;

public class Sum {
	
	public static void swap(int a[], int i, int r) {
		int temp = a[i];
		a[i] = a[r];
		a[r] = temp;
	}
	
	public static void reverseBetween(int a[], int i, int r) {
		r--;
		int len = (r-i)/2;
		for(int j=0 ; j<=len; j++) {
			swap(a,i,r);
			i++;
			r--;
		}
	}
	
	public static void rotateLeft(int a[], int l, int x) {
		
		reverseBetween(a,0,l);
		reverseBetween(a,0,l-x);
		reverseBetween(a,l-x,l);	
	}
	
	public static void rotateArray(int a[], int X, String dir) {
		
		int len = a.length;
		int x = X%len;
		if(x>0 && dir.equals("LEFT")) {
			rotateLeft(a,len, x);
		}
		
		for(int i = 0; i<len ; i++) {
			System.out.print(a[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt();
		String dir = s.next();
		int arr[] = new int[N];
		
		for(int i=0 ; i<N;i++) {
			arr[i] = s.nextInt();
		}
		
		rotateArray(arr, X, dir);
		
	}

}
