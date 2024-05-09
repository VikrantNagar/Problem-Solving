import java.util.Scanner;

public class ArrayEquillibriumIndex {
	
	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		
		int sumL = 0, sumR = 0;
		for(int i=0; i<arr.length ; i++) {
			sumR = sumR + arr[i];
		}
		sumR = sumR - arr[0] ;
		for(int i=1; i<arr.length ; i++) {
			sumL = sumL + arr[i-1];
			sumR = sumR - arr[i];
			if(sumL == sumR) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr1[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr1[i] = s.nextInt();
		}
		
		System.out.print(arrayEquilibriumIndex(arr1));
	}

}
