import java.util.Scanner;

public class TwoDArrrayMatrixSpiral {
	
	public static void printSpiral(int [][]arr, int n, int m) {
		
		int total = n*m;
		int upperrow = 0, upperCol = 0;
		int lowerRow = n-1, lowerCol = n-1;
		
		int count = 0;
		while(count<total) {
			for(int i=upperCol ; count<total && i<=lowerCol ; i++) {
				System.out.print(arr[upperrow][i] + " ");
				count++;
			}
			upperrow++;
			
			for(int i=upperrow ; count<total && i<=lowerRow ; i++) {
				System.out.print(arr[i][lowerCol]+ " ");
				count++;
			}
			lowerCol--;
			
			for(int i=lowerCol ; count<total && i>=upperCol ; i--) {
				System.out.print(arr[lowerRow][i]+ " ");
				count++;
			}
			lowerRow--;
			
			for(int i=lowerRow ; count<total && i>=upperrow ; i--) {
				System.out.print(arr[i][upperCol]+ " ");
				count++;
			}
			upperCol++;
		}
		
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
		printSpiral(arr, N, M);
	}

	}


