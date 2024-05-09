import java.util.Scanner;

public class ArrangeNumbersInArray {
	
	
	public static void arrange(int[] arr, int n) {
		
		int val = 1;
		for(int i=0; i<=(n-1)/2;i++)
		{
			arr[i] = val;
			val =val+2;
			System.out.print(arr[i]+ " ");
		}
		if(n%2==0)
		{
			val = n;
		}else
		{
			val= n-1;
		}
		for(int i=((n-1)/2)+1; i<n;i++)
		{
			arr[i] = val;
			val =val-2;
			System.out.print(arr[i] + " ");
		}
    }
	

	public static void main(String[] args) {
		
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
		arrange(arr,N);
		}
		}
		
		
	}
	}


