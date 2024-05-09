import java.util.Scanner;

public class TripletSum {
	
	public static int pairSum(int arr[], int x) {
    	//Your code goes here
		int count = 0;
		int sum;
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				for(int k=j+1 ; k<arr.length ; k++) {
				
					sum = arr[i] + arr[j] + arr[k];
				
					//System.out.print(sum + " ");
				
					if(sum==x) {
					 count ++;
				}
				}
			}
			//System.out.println();
		}
		return count;
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
