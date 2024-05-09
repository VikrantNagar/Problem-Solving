import java.util.Scanner;

public class TwoDArrayColumnWisetraversal {

	public static void printColWise(int [][]a) {
        // Write your code here.
		
		int arr1[] = new int[a.length*a[0].length];
		//System.out.print(arr1.length);
        int k=0;
        int rows = a.length;
        int cols = a[0].length;
        for(int j=0 ; j<cols ; j++) {
        	for(int i=0 ; i<rows; i++) {
        		arr1[k] = a[i][j];
        		k++;
        	}
        }
        for(int i=0; i<arr1.length ; i++) {
        	System.out.print(arr1[i]);
        }
		
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int arr[][]= new int[N][M];
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr.length ; j++) {
				arr[i][j] = s.nextInt();
				}
		}
		printColWise(arr);

	}

}
