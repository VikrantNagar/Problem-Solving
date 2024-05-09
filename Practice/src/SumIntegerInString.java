import java.util.Scanner;

public class SumIntegerInString {
	
	public static int sumInteger(String s) {
		
		int sum = 0;
		for(int i=0 ; i<s.length() ; i++) {
			char c = s.charAt(i);
			if(c>'0' && c<='9') {
				int a = c-'0';
				sum = sum+a;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		int sumOfInteger = sumInteger(str);
		System.out.println(sumOfInteger);
		

	}

}
