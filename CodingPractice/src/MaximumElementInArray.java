import java.util.Scanner;

public class MaximumElementInArray {
	
	public static void MaximumElementOfArray(int arr[]) {
		
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<n ; i++) {
			if(arr[i]>=max) {
				max = arr[i];
			}
		}
		System.out.print(max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int arr [] = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		
		MaximumElementOfArray(arr);
	}

}
