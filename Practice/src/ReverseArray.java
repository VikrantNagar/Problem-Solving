import java.util.Scanner;

public class ReverseArray {
	
	public static int[] reverseBetween(int n, int l, int r, int []arr) {
     
		int len = (r-l)/2;
		for(int i=0; i<=len; i++) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		int l = s.nextInt();
		int r = s.nextInt();
		if(N>0) {
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		reverseBetween(N,l,r,arr);
		}
		}

	}

}
