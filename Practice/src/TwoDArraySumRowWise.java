import java.util.Scanner;

public class TwoDArraySumRowWise {
	
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		if(mat.length>0 && mat[0].length >0) {
		int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i=0; i<rows ; i++) {
        	int sum=0;
        	for(int j=0 ;j<cols ; j++) {
        		sum =sum+mat[i][j];
        	}
        	 System.out.print(sum+ " ");
        }}
       
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		int arr[][]= new int[N][M];
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[0].length ; j++) {
				arr[i][j] = s.nextInt();
				}
		}
		rowWiseSum(arr);

	}
}
