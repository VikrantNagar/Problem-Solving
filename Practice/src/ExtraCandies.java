import java.util.Scanner;

public class ExtraCandies {
	
	public static void extraCandies(int n, int x, int []p1, int []p2) {
        // Write your code here.
		int extra = 0;
		
		for(int i=0; i<n ; i++) {
			int sum = p1[i] + p2[i] + extra;
			if(sum>x) {
				extra = sum-x;
				sum = x;
			}else if(sum<=x) {
				extra = 0;
			}
			p1[i] = sum;
 			System.out.print(p1[i]);
		}
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		int X = s.nextInt();
		if(N>0) {
		int P1[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			P1[i] = s.nextInt();
		}
		int P2[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			P2[i] = s.nextInt();
		}
		extraCandies(N,X,P1, P2);
		}
		}

	}

}
