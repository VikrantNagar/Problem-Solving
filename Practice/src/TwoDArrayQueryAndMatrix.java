import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayQueryAndMatrix {
	public static void query(int[][] mat, int m, int n, String q) {
		
		// Write your code here.
		System.out.print(q.length());
		
		for(int i=0 ; i<q.length() ; i++) {
			if(q.charAt(i) == '1') {
				if(q.charAt(i+1)=='R') {
					for(int j=0; j<mat.length ; j++) {
						if(mat[i+2][j] ==0) {
							mat[i+2][j] = 1;
						}else {
							mat[i+2][j] =0;
						}
						
					}
				}
					
				}else if(q.charAt(i+1)=='C') {
					for(int j=0; j<mat.length ; j++) {
						if(mat[j][i+2] ==0) {
							mat[j][i+2] = 1;
						}else {
							mat[j][i+2] =0;
						}
					
				}
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
		 
		String[] query = new String[3];
		String q = "";
		for(int i=0 ; i<query.length ; i++)
		{
			 query[i] = s.next();
			
		}
		query(arr, M, N, q);
	

	}

}
