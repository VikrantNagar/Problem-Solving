import java.util.Scanner;

public class RecursionPallindromString {
	
	public static boolean isStringPalindrome(String input) {
		// Write your code here

		int n = input.length();
		if(n==0) {
			return true;
		}
		return helper(input, 0, n-1);
		
	}
	
	public static boolean helper(String input,int s, int e) {
		
		if(s==e) {
			return true;
		}
		if(input.charAt(s) != input.charAt(e) ) {
			return false;
		}
		if(s<e+1) {
		return helper(input,s+1, e-1);
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(isStringPalindrome(str));
		

	}

}
