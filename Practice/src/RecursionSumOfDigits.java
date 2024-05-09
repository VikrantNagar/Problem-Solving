import java.util.Scanner;

public class RecursionSumOfDigits {
	
	public static int sumOfDigits(int input){
		
 		if(input == 0) {
 			return 0;
 		}
 		
 		return (input%10) + sumOfDigits(input/10); 
// 		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(sumOfDigits(n));
	}

}
