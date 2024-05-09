import java.util.Scanner;

public class PrintTwoDArray {
	public static void print2DArray(int input[][]) {
		// Write your code here
		int len = input.length;
		
		for(int i =0 ; i<input.length ; i++) {
			
			for(int j=len-i; j>0 ; j--) {
				
				for(int k=0; k<input.length; k++) {
					
				System.out.print(input[i][k]);
				}
				
				System.out.println();
			}
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
		print2DArray(arr);
	

	}

	

}
