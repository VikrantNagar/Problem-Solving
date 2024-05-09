import java.util.Scanner;

public class TwoDArrayRowWiseTraversal {
	
	public static int[] printRowWise(int [][]a) {
        // Write your code here.
		/* The method first initializes a new 1D integer
        array arr with the length equal to the product 
        of the number of rows and columns in the input 2D array. 
        It also initializes an integer variable k to 0.*/
        int arr1[] =new int[a.length*a[0].length];
        System.out.print(arr1.length);
        int k=0;
        /*Then, it uses nested for-loops to traverse the input 
        array row by row, and column by column. For each element
         in the input array, it copies its value to the arr array at
          index k and increments k by 1*/
        
        for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length ; j++) {
			arr1[k++]=a[i][j];
				
				}
                /*Finally, the method returns the arr array, which now
                 contains all the elements of the input array in row-wise order.*/
			
		}
        return arr1;
	}
		
		
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int arr[][]= new int[N][M];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length ; j++) {
				arr[i][j]=s.nextInt();			}
		}
		int arr2[]=printRowWise(arr);
		System.out.print(arr2);
	}

}
