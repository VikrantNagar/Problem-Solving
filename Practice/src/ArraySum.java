import java.util.Scanner;
public class ArraySum {

	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int a = 0,b = 0;
		for(int j = 0;j<t;j++)
		{
			
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.print(sum(arr));
		}
}
}
