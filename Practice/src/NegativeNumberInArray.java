import java.util.Scanner;

public class NegativeNumberInArray {
	
	public static boolean NegativeNumber(int arr[]){
		
		//int j = Integer.MIN_VALUE;
		for(int i=0; i<arr.length ; i++) {
			if(i != arr.length-1)
			for(int j=i+1 ; j>i ; j--) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
			return true;
			
		}
		return false;
        
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
		boolean b=NegativeNumber(arr);
		if(b)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		}
		}

	}

}
