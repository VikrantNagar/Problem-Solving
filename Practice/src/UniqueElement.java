
import java.util.Arrays;
import java.util.Scanner;

public class UniqueElement {
	
	public static void findUnique(int[] arr) {
		//Your code goes here
		//int count = 0;
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length ; i++) {
				
			arr[0]=arr[0]^arr[i] ;
				
			
			
		}
		System.out.print(arr[0]);
//		for(int i=0; i<arr.length ; i++) {
//			int count = 0;
//			for(int j=0; j<arr.length ; j++) {
//				
//			if(arr[i]==arr[j]) {
//				count++;
//			}
//			
//		}
//			if(count <=1) {
//				System.out.print(arr[i]);
//				
//			}
//		}
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
		
		findUnique(arr1);
	}

}
