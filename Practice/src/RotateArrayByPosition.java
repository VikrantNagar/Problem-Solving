import java.util.Scanner;

public class RotateArrayByPosition {
	
	public static void rotateArray(int [] arr, int pos, int N) {
		
		int p = 1;
		
		while(p<=pos) {
			int last = arr[0];
			for(int i=0 ; i<N-1 ; i++) {
				
				arr[i] = arr[i+1];
			}
			arr[N-1] = last;
			p++;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int pos = s.nextInt();
		int arr [] = new int[N];
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		rotateArray(arr, pos, N);
	}

}
