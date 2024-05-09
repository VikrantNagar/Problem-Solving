import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementInArray {
	
	public static int findDuplicate(int[] arr) {
		//Your code goes here
	//	int count =0;
	//Arrays.sort(arr);
	int duplicate =0;
		for(int i=1; i<arr.length ; i++){
			duplicate = duplicate ^ arr[i];
		}
			for(int j=0; j<arr.length ; j++){
			duplicate = duplicate ^ arr[j];
		}
		
		return duplicate;
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
		
		System.out.print(findDuplicate(arr1));
	}


	
}
