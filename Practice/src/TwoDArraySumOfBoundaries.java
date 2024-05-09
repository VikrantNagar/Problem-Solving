
import java.util.Scanner;

public class TwoDArraySumOfBoundaries {
	
	public static void totalSum(int[][] arr) {
		//Your code goes here
		if(arr.length > 0){
		int sum = 0;
		int N = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[0][i];
			sum = sum+arr[N-1][i];
			
		}
		for(int i=1; i<N-1; i++) {
			sum = sum+arr[i][0];
			sum = sum+arr[i][N-1];
			
		}
		for(int i=1; i<N-1; i++) {
			sum = sum+arr[i][i];
			sum = sum+arr[i][N-1-i];
			
		}
		if(N%2!=0) {
			sum = sum-arr[N/2][N/2];
		}
		System.out.print(sum);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		int[][] arr= new int[N][M];
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[0].length ; j++) {
				arr[i][j] = s.nextInt();
				}
		}
		totalSum(arr);
	}

}
