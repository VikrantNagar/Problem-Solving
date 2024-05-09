import java.util.Scanner;

public class SortArray012 {
	
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
		int count0 = 0, count1= 0 ;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0) {
				count0++;
			}else if(arr[i]==1) {
				count1++;
			}
		}
		for(int j=0 ; j<count0 ; j++) {
			arr[j] = 0;
			}
		for(int i=count0 ; i<count0+count1 ; i++) {
			arr[i] = 1;
		}for(int i=count0+count1 ; i<arr.length ; i++) {
			arr[i] = 2;
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
