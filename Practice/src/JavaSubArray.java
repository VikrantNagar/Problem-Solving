import java.util.Scanner;

public class JavaSubArray {
	
	public static void SubArray(int[] arr) {
		
		int count = arr.length-1;
		System.out.print(arr.length+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr [] = new int[n];
		
		for(int i=0; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		SubArray(arr);
		
	}

}
