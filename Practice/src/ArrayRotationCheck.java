import java.util.Scanner;

public class ArrayRotationCheck {
	
	
	public static int rotateArray(int []a) {
        // Write your code here.
		int n = a.length;
		for(int i=0; i<n-1; i++) {         // 5 6 1 2 3 4
			if(a[i]>a[i+1]) {              //5<=5, 5<=6, 6<=1
				return (i+1);
		}
			
		}return 0;	
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
		System.out.print(rotateArray(arr));
		}
		}

	}

}
