import java.util.Scanner;

public class TwoDArrayPrintWave {
	
	
	public static void wavePrint(int mat[][]){
		//Your code goes here
		if(mat.length>0 && mat[0].length >0) {
		int total = mat.length*mat[0].length;
		int upperrow = 0, upperCol = 0;
		int lowerRow = mat.length-1;
		int count = 0;
		
		while(count<total) {
			for(int i=upperrow ; count<total && i<=lowerRow ; i++) {
				System.out.print(mat[i][upperCol]+ " ");
				count++;
			}
			upperCol++;
			
			for(int i=lowerRow ; count<total && i>=upperrow ; i--) {
				System.out.print(mat[i][upperCol]+ " ");
				//sum  = sum + mat[i][upperCol];
				count++;
			}
			upperCol++;
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
		wavePrint(arr);
	

	}

}
