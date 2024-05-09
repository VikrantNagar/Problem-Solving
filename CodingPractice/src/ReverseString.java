import java.util.Scanner;

public class ReverseString {
	
	public static void reverseString(String str) {
		
		int len = str.length();
		for(int i=len-1 ; i>=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s  = new Scanner(System.in);
		String str = s.next();
		
		reverseString(str);
	}

}
