import java.util.Scanner;

public class RecursionSumOfArray {
	
	public static int sum(int input[]) {	
        return helper(input, input.length-1);
	}
    
    private static int helper(int input[], int n){
        
        if(n==0)
            return input[n];  
        
        int answer = input[n];        
        int temp = helper(input, n-1);
        
		answer += temp;        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<arr.length ; i++) {
			arr[i] = s.nextInt();
		}

	 System.out.print(sum(arr));
	}

}
