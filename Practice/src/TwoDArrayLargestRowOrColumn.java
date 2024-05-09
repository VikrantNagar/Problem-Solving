import java.util.Scanner;

public class TwoDArrayLargestRowOrColumn {
	
	public static void findLargest(int mat[][]){
		//Your code goes here
		if(mat.length>0 && mat[0].length >0) {
		int rows = mat.length;
        int cols = mat[0].length;
        int row_Index = 0, col_Index = 0;
        int maxrow = Integer.MIN_VALUE;
        int maxcol = Integer.MIN_VALUE;
        int row_sum = 0, col_sum =0;
        for(int i=0; i<rows ; i++) {
        	row_sum = 0;
        	for(int j=0 ;j<cols ; j++) {
        			row_sum= row_sum+mat[i][j];
        			
        		}
        	//System.out.println(row_sum);
        	if(row_sum>maxrow) {
        		maxrow = row_sum;
        		row_Index = i;	
        	}
        	//System.out.println(maxrow);
        }
        
        for(int i=0; i<cols ; i++) {
        	col_sum = 0;
        	for(int j=0 ;j<rows ; j++) {
        			col_sum= col_sum+mat[j][i];
        		}
        	if(col_sum>maxcol) {
        		maxcol = col_sum;
        		col_Index = i;
        	}
        }
        if(maxrow < maxcol) {
        	System.out.print("column" + " " + col_Index +" "+ maxcol);
        }else {
        	System.out.print("row" + " " + row_Index + " " + maxrow);
        }
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
		findLargest(arr);
	}

}
