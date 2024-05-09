import java.util.Scanner;

public class smallestDifferencePair {
	
	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        
		int diff = Integer.MAX_VALUE;
		int new_diff = 0;
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<m ;j++) {
				new_diff = Math.abs(arr1[i]-arr2[j]);
				if(new_diff<diff) {
					diff=new_diff;
				}
			}
		}
		System.out.print(diff);
		return 0;
		
		
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
		smallestDifferencePair(arr1,N,arr2,M);
	
		}
		}
	}

