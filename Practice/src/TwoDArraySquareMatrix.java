import java.util.Scanner;

public class TwoDArraySquareMatrix {
	
	public static void sqrMat(int [][]mat, int n, int m) {
		int len = n+m;
		int []arr = new int[n];
		if(len%n ==0) {
			System.out.println("YES");
			for(int i=0; i<n ;i++) {
				arr[i] = mat[i][i];
				System.out.print(arr[i] + " ");
			}
			
		}else
		{
			System.out.print("NO");
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
		sqrMat(arr, N, M);
	}

}
