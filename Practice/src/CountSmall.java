import java.util.Scanner;

public class CountSmall {
	
	public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
		//int count = 0;
		
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=0; j<m ;j++) {
				if(a[i]>b[j]) {
					count++;
				}
			}
			a[i] = count;
			System.out.print(a[i]);
		}
		return a;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		//if(N>0) {
		int arr1[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr1[i] = s.nextInt();
		}
		
		int M = s.nextInt();
		//if(M>0) {
		int arr2[] = new int[M];
		
		for(int i=0; i<M; i++)	
		{
			arr2[i] = s.nextInt();
		}
		countS(N,M,arr1,arr2);
	
		}
		}
	}

