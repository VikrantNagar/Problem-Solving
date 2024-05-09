import java.util.Scanner;

public class SortArray {
	
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0) {
				count++;
			}
		}
		for(int j=0 ; j<count ; j++) {
			arr[j] = 0;
			}
		for(int i=count ; i<arr.length ; i++) {
			arr[i] = 1;
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i] + " ");
		}
		
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
		sortZeroesAndOne(arr);
		}
		}

	}

}
