import java.util.Scanner;

public class ReverseAnArray {
	
	public static void reverseArray(int arr[]) {
		
		int n = arr.length;
		int l = n-1;
		int temp ;
		for(int i=0 ; i<arr.length/2 ; i++) {
			temp = arr[i];
			arr[i] = arr[l-i];
			arr[l-i] = temp;
			
		}
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int arr [] = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = s.nextInt();
		}
		reverseArray(arr);
		s.close();
	}

}
