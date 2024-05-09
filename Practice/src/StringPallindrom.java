import java.util.Scanner;
public class StringPallindrom {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		int n = str.length();
		int k = n/2;
		int i = 0;
		int j = n-1;
		while(k>0) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				k--;
			}
			else {
				k--;
				return false;
				
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(isPalindrome(str));
		

	}

}
