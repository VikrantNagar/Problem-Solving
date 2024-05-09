import java.util.Scanner;
public class LinearSearch {

	
	public static int linearSearch(int arr[], int x) {
		for(int i= 0 ; i<arr.length ; i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		
		return -1;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		
		int arr[] = new int[N];
	
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		int X = s.nextInt();
		linearSearch(arr,X);
		System.out.print(linearSearch(arr, X));
		}
	}

}
