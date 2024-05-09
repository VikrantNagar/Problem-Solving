import java.util.Scanner;

public class SwapAlternate {

	
	public static void swapAlternate(int arr[]) {
    	//Your code goes here
		int val;
		int n  = arr.length;
		for(int i = 0;i<n-1 ;i=i+2)
		{
			if(i!=n-1) {
			val = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = val;
			System.out.print(arr[i] + " " + arr[i+1] + " ");
		}
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j = 0;j<t;j++)
		{	
		int N = s.nextInt();
		if(N>0) {
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		swapAlternate(arr);
		}
		}

	}

}

// int N  = arr.length;
// int temp ;
// int i = 0;
//
// while(i<N-1){
//    temp = arr[i];
//    arr[i] = arr[i+1];
//    arr[i+1] = temp;
//    i+=2;
//    
//}
