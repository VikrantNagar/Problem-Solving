import java.util.Scanner;

public class TwoDArrrayTransponseMatrix {
	
	public static int[][] transpose(int [][]a, int n, int m) {
		
		int arr[][] = new int[m][n];
        int rows = a.length;
        int cols = a[0].length;
        for(int j=0 ; j<cols ; j++) {
        	for(int i=0 ; i<rows; i++) {
        		arr[j][i] = a[i][j];
        		//k++;
        	}
        	
        }
		return arr;
		
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
		int ans[][] = transpose(arr, N, M);
		for (int j = 0; j < ans.length; j++) {
			for (int k = 0; k < ans[0].length; k++) {
				System.out.print(ans[j][k] + " ");
			}
			System.out.println();
		}
	}

	}


