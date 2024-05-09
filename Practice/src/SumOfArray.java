import java.util.Scanner;

public class SumOfArray {
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
		int i = arr1.length-1; //i=2
		int j = arr2.length-1; //j=2
		int k = Math.max(arr1.length,arr2.length); //k=3
		int carry = 0;
		while(i>=0 && j>=0) {
			int sum = arr1[i]+arr2[j]+carry; // sum = 10, 19, 12
			output[k] = sum%10; // output[3,2] = 0,9, 2
			carry = sum/10; // carry = 1,1,1;
			i--; //i=1,0
			j--; //j=1,0
			k--; //k=2,1,0
		}
		while(i>=0) {
			int sum = arr1[i]+carry;
			output[k] = sum%10;
			carry = sum/10;
			i--;
			k--;
		}
		while(j>=0) {
			int sum = arr2[j]+carry;
			output[k] = sum%10;
			carry = sum/10;
			j--;
			k--;
		}
		output[0] = carry;
		for(int l=0 ; l<output.length; l++) {
			System.out.print(output[l]);
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		//if(N>0) {
		int arr1[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr1[i] = s.nextInt();
		}
		
		int M = s.nextInt();
		//if(M>0) {
		int arr2[] = new int[M];
		
		for(int i=0; i<M; i++)	
		{
			arr2[i] = s.nextInt();
		}
		int output[] = new int[N+1];
		sumOfTwoArrays(arr1,arr2, output);
		
		}
		}

	}


