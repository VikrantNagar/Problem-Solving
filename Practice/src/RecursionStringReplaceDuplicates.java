import java.util.Scanner;

public class RecursionStringReplaceDuplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <= 1){
			return s;
		}
		if(s.charAt(0) == s.charAt(1)){
			String smallOutput = removeConsecutiveDuplicates(s.substring(1));
			return smallOutput; 
		}else{
			String smallOutput = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + smallOutput;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(removeConsecutiveDuplicates(str));
	}

}
