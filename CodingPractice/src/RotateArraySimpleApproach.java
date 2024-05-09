import java.util.Scanner;

public class RotateArraySimpleApproach {

	public static void rotateArray(int arr[], int X, int N) {
		
		int p=1;
		
// Left Rotation		
//		while(p<=X) {
//			int last = arr[0];
//			for(int i=0 ; i<N-1 ; i++) {
//				
//				arr[i] = arr[i+1];
//		
//		}
//			arr[N-1] = last;
//			p++;
//		}
	
		
// Right rotation		
		while(p<=X) {
			int last = arr[N-1];
			for(int i=N-1 ; i>0 ; i--) {
				
				arr[i] = arr[i-1];
		
		}
			arr[0] = last;
			p++;
		}
		for(int i=0; i<N ; i++) {
			System.out.print(arr[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int X = s.nextInt();
		int arr[] = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		rotateArray(arr, X, N);
		
	}

}
